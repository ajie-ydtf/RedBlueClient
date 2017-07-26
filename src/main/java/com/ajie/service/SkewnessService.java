package com.ajie.service;

import java.util.Map;

/**
 * 偏态服务
 * Created by aJie on 2017/6/15.
 */
public interface SkewnessService {
    /**
     * 篮球大小偏态分析
     *
     * @param num                期数-范围5~10
     * @param winningBlueDataMap
     */
    void blueMaxMin(int num, Map<String, Integer> winningBlueDataMap) throws Exception;

    /**
     * 红球大小偏态分析
     *
     * @param num               期数-范围5~10
     * @param winningRedDataMap
     */
    void redMaxMin(int num, Map<String, int[]> winningRedDataMap) throws Exception;

    /**
     * 篮球奇偶偏态分析
     *
     * @param num                期数-范围5~10
     * @param winningBlueDataMap
     */
    void blueOddEven(int num, Map<String, Integer> winningBlueDataMap) throws Exception;

    /**
     * 红球奇偶偏态分析,偏差大于等于8给出提示
     *
     * @param num               期数-范围5~10
     * @param winningRedDataMap
     */
    void redOddEven(int num, Map<String, int[]> winningRedDataMap) throws Exception;

    /**
     * 红球和值分析,在102上下波动次数给出提示
     *
     * @param num
     * @param winningRedDataMap
     * @throws Exception
     */
    void redSum(int num, Map<String, int[]> winningRedDataMap) throws Exception;
}
