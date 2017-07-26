package com.ajie.service;

import com.ajie.common.ConstantValue;
import com.ajie.common.Tools;

import java.util.Map;

/**
 * Created by aJie on 2017/6/15.
 */
public class SkewnessServiceImp implements SkewnessService {
    /**
     * 篮球大小偏态分析
     *
     * @param num                期数-范围5~10
     * @param winningBlueDataMap
     */
    public void blueMaxMin(int num, Map<String, Integer> winningBlueDataMap) throws Exception {
        if (!Tools.checkNumIsInTheGroup(num)) {
            throw new Exception("只能分析5到10期的数据!");
        }
        if (Tools.checkMapIsNull(winningBlueDataMap)) {
            throw new Exception("需要提供篮球数据!");
        }
        int count = 1, max = 0, min = 0;
        for (String blueKey : winningBlueDataMap.keySet()) {
            if (count > num) {
                break;
            }
            int blueValue = winningBlueDataMap.get(blueKey);
            if (blueValue < ConstantValue.blueMaxMin) {
                min++;
            } else {
                max++;
            }
            count++;
        }
        System.out.println(String.format("篮球大小偏态分析%d期结果:大数%d个,小数%d个.", num, max, min));
    }

    /**
     * 红球大小偏态分析
     *
     * @param num               期数-范围5~10
     * @param winningRedDataMap
     */
    public void redMaxMin(int num, Map<String, int[]> winningRedDataMap) throws Exception {
        if (!Tools.checkNumIsInTheGroup(num)) {
            throw new Exception("只能分析5到10期的数据!");
        }
        if (Tools.checkMapIsNull(winningRedDataMap)) {
            throw new Exception("需要提供红球数据!");
        }
        int count = 1;
        for (String redKey : winningRedDataMap.keySet()) {
            if (count > num) {
                break;
            }
            int max = 0, min = 0;
            int[] redValue = winningRedDataMap.get(redKey);
            for (int i = 0; i < redValue.length; i++) {
                if (redValue[i] < ConstantValue.redMaxMin) {
                    min++;
                } else {
                    max++;
                }
            }
            System.out.println(String.format("红球大小偏态分析第%s期结果:大数%d个,小数%d个.", redKey, max, min));
            count++;
        }
    }

    /**
     * 篮球奇偶偏态分析
     *
     * @param num                期数-范围5~10
     * @param winningBlueDataMap
     */
    public void blueOddEven(int num, Map<String, Integer> winningBlueDataMap) throws Exception {
        if (!Tools.checkNumIsInTheGroup(num)) {
            throw new Exception("只能分析5到10期的数据!");
        }
        if (Tools.checkMapIsNull(winningBlueDataMap)) {
            throw new Exception("需要提供篮球数据!");
        }
        int count = 1, odd = 0, even = 0;//odd奇数,even偶数
        for (String blueKey : winningBlueDataMap.keySet()) {
            if (count > num) {
                break;
            }
            int blueValue = winningBlueDataMap.get(blueKey);
            if (blueValue % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            count++;
        }
        System.out.println(String.format("篮球奇偶偏态分析%d期结果:奇数%d个,偶数%d个.", num, odd, even));
    }

    /**
     * 红球奇偶偏态分析,偏差大于等于8给出提示
     *
     * @param num               期数-范围5~10
     * @param winningRedDataMap
     */
    public void redOddEven(int num, Map<String, int[]> winningRedDataMap) throws Exception {
        if (!Tools.checkNumIsInTheGroup(num)) {
            throw new Exception("只能分析5到10期的数据!");
        }
        if (Tools.checkMapIsNull(winningRedDataMap)) {
            throw new Exception("需要提供红球数据!");
        }
        int count = 1, oddTotal = 0, evenTotal = 0;
        for (String redKey : winningRedDataMap.keySet()) {
            if (count > num) {
                break;
            }
            int odd = 0, even = 0;//odd奇数,even偶数
            int[] redValue = winningRedDataMap.get(redKey);
            for (int i = 0; i < redValue.length; i++) {
                if (redValue[i] % 2 == 0) {
                    even++;
                    evenTotal++;
                } else {
                    odd++;
                    oddTotal++;
                }
            }
            System.out.println(String.format("红球奇偶偏态分析第%s期结果:奇数%d个,偶数%d个.", redKey, odd, even));
            count++;
        }
        System.out.println(String.format("红球奇偶偏态分析%d期结果:奇数%d个,偶数%d个.", num, oddTotal, evenTotal));
        int result = oddTotal >= evenTotal ? (oddTotal - evenTotal) : (evenTotal - oddTotal);
        if (result >= 8) {
            System.out.println("红球奇偶偏态分析相差大于等于8,请关注是否调整奇偶个数比!");
        } else {
            System.out.println("红球奇偶偏态分析相差小于8,可以不关注是否调整奇偶个数比!!");
        }
    }

    /**
     * 红球和值分析,在102上下波动次数给出提示
     *
     * @param num
     * @param winningRedDataMap
     * @throws Exception
     */
    public void redSum(int num, Map<String, int[]> winningRedDataMap) throws Exception {
        if (!Tools.checkNumIsInTheGroup(num)) {
            throw new Exception("只能分析5到10期的数据!");
        }
        if (Tools.checkMapIsNull(winningRedDataMap)) {
            throw new Exception("需要提供红球数据!");
        }
        int count = 1, count102Up = 0, count102Down = 0;
        for (String redKey : winningRedDataMap.keySet()) {
            if (count > num) {
                break;
            }
            int[] redValue = winningRedDataMap.get(redKey);
            int thisSum = 0;
            for (int i = 0; i < redValue.length; i++) {
                thisSum += redValue[i];
            }
            if (thisSum >= 102) {
                count102Up++;
            } else {
                count102Down++;
            }
            System.out.println(String.format("红球和值偏态分析第%s期结果:和%d.", redKey, thisSum));
            count++;
        }
        System.out.println(String.format("红球和值偏态分析%d期结果:102往上偏离%d次,102往下偏离%d次.", num, count102Up, count102Down));
    }
}
