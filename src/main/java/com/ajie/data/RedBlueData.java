package com.ajie.data;


import java.util.Map;

/**
 * 数据集接口
 * Created by aJie on 2017/6/15.
 */
public interface RedBlueData {
    void initWinningData(Map<String, Integer> winningBlueDataMap, Map<String, int[]> winningRedDataMap);
}
