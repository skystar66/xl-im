package com.xl.xim.common.algorithm;

import java.util.List;

/**
 * @author: xl
 * @date: 2021/8/5
 **/
public interface RouteHandle {

    /**
     * 再一批服务器里进行路由
     *
     * @param values
     * @param key
     * @return
     */
    String routeServer(List<String> values, String key);
}
