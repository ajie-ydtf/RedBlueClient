package com.ajie.service;

import com.ajie.common.ConstantValue;
import com.ajie.common.PermutationAndCombination;
import com.ajie.common.Tools;
import com.ajie.entity.SkewnessVo;

import java.util.*;

/**
 * Created by aJie on 2017/6/16.
 */
public class RedOddEvenMaxMinUpDownSuggestServiceImp implements SuggestService {
    /**
     * 选球建议-红球,根据奇偶偏态分析、大小数偏态分析和和值偏态分析
     *
     * @param skewnessVo 根据算法分析后用户意向输入的数据
     */
    public void getSysSuggest(SkewnessVo skewnessVo) throws Exception {
        if (null == skewnessVo.getEvenNum()) {
            throw new Exception("偶数个数不能为空!");
        }
        if (null == skewnessVo.getOddNum()) {
            throw new Exception("奇数个数不能为空!");
        }
        if (null == skewnessVo.getMaxNum()) {
            throw new Exception("最大数个数不能为空!");
        }
        if (null == skewnessVo.getMinNum()) {
            throw new Exception("最小数个数不能为空!");
        }
        if (null == skewnessVo.getUpOrDown()) {
            throw new Exception("和值波动情况不能为空!");
        }

        List<Integer> evenList = Tools.getRedEvenList();//偶数
        List<Integer> oddList = Tools.getRedOddList();//奇数
        if (Tools.checkListIsNull(evenList) || Tools.checkListIsNull(oddList)) {
            throw new Exception("未能获取到奇偶数!");
        }
        if (skewnessVo.getEvenNum() < ConstantValue.ballMin || skewnessVo.getEvenNum() > ConstantValue.ballRedMax) {
            throw new Exception("偶数参数只能在1~6之间选择");
        }
        if (skewnessVo.getOddNum() < ConstantValue.ballMin || skewnessVo.getOddNum() > ConstantValue.ballRedMax) {
            throw new Exception("奇数参数只能在1~6之间选择");
        }
        if (skewnessVo.getEvenNum() + skewnessVo.getOddNum() != ConstantValue.ballRedMax) {
            throw new Exception("奇数和偶数个数之和必须等于6");
        }
        if (skewnessVo.getMinNum() < ConstantValue.ballMin || skewnessVo.getMinNum() > ConstantValue.ballRedMax) {
            throw new Exception("小数参数只能在1~6之间选择");
        }
        if (skewnessVo.getMaxNum() < ConstantValue.ballMin || skewnessVo.getMaxNum() > ConstantValue.ballRedMax) {
            throw new Exception("大数参数只能在1~6之间选择");
        }
        if (skewnessVo.getMinNum() + skewnessVo.getMaxNum() != ConstantValue.ballRedMax) {
            throw new Exception("大数和小数个数之和必须等于6");
        }

        PermutationAndCombination permutationAndCombination = new PermutationAndCombination();
        permutationAndCombination.arrangementSelect(Tools.intListToStringArray(oddList), skewnessVo.getOddNum());
        //permutationAndCombination.combinationSelect(Tools.intListToStringArray(oddList), skewnessVo.getOddNum());
    }
}
