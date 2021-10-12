package com.xl.xim.common.algorithm.consistenthash;

import com.xl.xim.common.algorithm.RouteHandle;

import java.util.List;

/**
 * @author: xl
 * @date: 2021/8/5
 **/
public class ConsistentHashHandle implements RouteHandle {
    private AbstractConsistentHash hash;

    public void setHash(AbstractConsistentHash hash) {
        this.hash = hash;
    }

    @Override
    public String routeServer(List<String> values, String key) {
        return hash.process(values, key);
    }
}
