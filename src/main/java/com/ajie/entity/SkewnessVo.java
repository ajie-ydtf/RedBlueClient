package com.ajie.entity;

import java.io.Serializable;

/**
 * Created by aJie on 2017/6/16.
 */
public class SkewnessVo implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 奇数个数
     */
    private Integer oddNum;
    /**
     * 偶数个数
     */
    private Integer evenNum;
    /**
     * 大数个数
     */
    private Integer maxNum;
    /**
     * 小数个数
     */
    private Integer minNum;
    /**
     * 和值,大于102:true,小于102:false
     */
    private Boolean upOrDown;

    public Integer getEvenNum() {
        return evenNum;
    }

    public void setEvenNum(Integer evenNum) {
        this.evenNum = evenNum;
    }

    public Integer getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
    }

    public Integer getMinNum() {
        return minNum;
    }

    public void setMinNum(Integer minNum) {
        this.minNum = minNum;
    }

    public Boolean getUpOrDown() {
        return upOrDown;
    }

    public void setUpOrDown(Boolean upOrDown) {
        this.upOrDown = upOrDown;
    }

    public Integer getOddNum() {
        return oddNum;
    }

    public void setOddNum(Integer oddNum) {
        this.oddNum = oddNum;
    }
}
