package com.ajie.data;

import com.ajie.common.Tools;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by aJie on 2017/6/15.
 */
public class HandRedBlueData implements RedBlueData {

    public void initWinningData(Map<String, Integer> winningBlueDataMap, Map<String, int[]> winningRedDataMap) {
        Map<String, Integer> blueDataMap = new LinkedHashMap<String, Integer>() {{
            put("2017069", 5);
            put("2017068", 15);
            put("2017067", 4);
            put("2017066", 3);
            put("2017065", 7);
            put("2017064", 15);
            put("2017063", 4);
            put("2017062", 10);
            put("2017061", 11);
            put("2017060", 4);
        }};
        winningBlueDataMap.clear();
        winningBlueDataMap.putAll(blueDataMap);

        Map<String, int[]> redDataMap = new LinkedHashMap<String, int[]>();
        redDataMap.put("2017069", Tools.setRedDataMap(2, 11, 12, 23, 29, 31));
        redDataMap.put("2017068", Tools.setRedDataMap(2, 6, 10, 22, 30, 31));
        redDataMap.put("2017067", Tools.setRedDataMap(1, 3, 4, 10, 18, 29));
        redDataMap.put("2017066", Tools.setRedDataMap(1, 4, 6, 17, 19, 26));
        redDataMap.put("2017065", Tools.setRedDataMap(2, 5, 8, 10, 12, 21));
        redDataMap.put("2017064", Tools.setRedDataMap(2, 10, 16, 22, 24, 28));
        redDataMap.put("2017063", Tools.setRedDataMap(12, 16, 20, 22, 25, 31));
        redDataMap.put("2017062", Tools.setRedDataMap(1, 7, 22, 24, 26, 31));
        redDataMap.put("2017061", Tools.setRedDataMap(6, 7, 12, 20, 26, 27));
        redDataMap.put("2017060", Tools.setRedDataMap(5, 10, 13, 24, 26, 31));
        winningRedDataMap.clear();
        winningRedDataMap.putAll(redDataMap);
    }
}
