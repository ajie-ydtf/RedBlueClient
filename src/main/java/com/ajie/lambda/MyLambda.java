package com.ajie.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by aJie on 2017/7/25.
 */
public class MyLambda {
    public void fistMethod() {
        //lambda表达式通常以(argument)->(body)这样的格式书写
        String[] atp = {"aa", "bb", "cc", "dd", "ee", "ff", "gg"};
        List<String> atpList = Arrays.asList(atp);
        atpList.forEach((par) -> System.out.println(par));
    }
}
