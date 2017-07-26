package com.ajie.service;

import com.ajie.entity.SkewnessVo;

/**
 * 选球建议服务
 * Created by aJie on 2017/6/16.
 */
public interface SuggestService {
    /**
     * 选球建议
     *
     * @param skewnessVo 根据算法分析后用户意向输入的数据
     */
    void getSysSuggest(SkewnessVo skewnessVo) throws Exception;
}
