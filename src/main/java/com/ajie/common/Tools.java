package com.ajie.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by aJie on 2017/6/15.
 */
public class Tools {
    /**
     * 判断书否5到10期范围进行分析
     *
     * @param num
     * @return
     */
    public static boolean checkNumIsInTheGroup(int num) {
        return num >= 5 && num <= 10 ? true : false;
    }

    /**
     * 判断Map是否为空
     *
     * @param map
     * @return
     */
    public static boolean checkMapIsNull(Map map) {
        return null == map || map.size() == 0 ? true : false;
    }

    /**
     * 判断List是否为空
     *
     * @param list
     * @return
     */
    public static boolean checkListIsNull(List list) {
        return null == list || list.size() == 0 ? true : false;
    }

    /**
     * 红球6个数字转数组
     *
     * @param a
     * @param b
     * @param c
     * @param d
     * @param e
     * @param f
     * @return
     */
    public static int[] setRedDataMap(int a, int b, int c, int d, int e, int f) {
        int[] red = {a, b, c, d, e, f};
        return red;
    }

    /**
     * 获取偶数
     *
     * @param isRed 红球true,篮球false
     * @return
     */
    private static List<Integer> getEvenList(boolean isRed) {
        int ballNum = isRed ? ConstantValue.redBallMax : ConstantValue.blueBallMax;
        List<Integer> evenList = new ArrayList<Integer>();
        for (int i = 1; i <= ballNum; i++) {
            if (i % 2 == 0) {
                evenList.add(i);
            }
        }
        return evenList;
    }

    /**
     * 获取奇数
     *
     * @param isRed 红球true,篮球false
     * @return
     */
    private static List<Integer> getOddList(boolean isRed) {
        int ballNum = isRed ? ConstantValue.redBallMax : ConstantValue.blueBallMax;
        List<Integer> oddList = new ArrayList<Integer>();
        for (int i = 1; i <= ballNum; i++) {
            if (i % 2 != 0) {
                oddList.add(i);
            }
        }
        return oddList;
    }

    /**
     * 获取红球偶数
     *
     * @return
     */
    public static List<Integer> getRedEvenList() {
        return getEvenList(true);
    }

    /**
     * 获取篮球偶数
     *
     * @return
     */
    public static List<Integer> getBlueEvenList() {
        return getEvenList(false);
    }

    /**
     * 获取红球奇数
     *
     * @return
     */
    public static List<Integer> getRedOddList() {
        return getOddList(true);
    }

    /**
     * 获取篮球奇数
     *
     * @return
     */
    public static List<Integer> getBlueOddList() {
        return getOddList(false);
    }

    public static String[] intListToStringArray(List<Integer> intList) {
        String[] stringsArray = new String[intList.size()];
        for (int i = 0; i < intList.size(); i++) {
            stringsArray[i] = String.valueOf(intList.get(i));
        }
        return stringsArray;
    }
}
