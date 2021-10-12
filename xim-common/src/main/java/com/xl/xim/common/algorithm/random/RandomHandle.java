package com.xl.xim.common.algorithm.random;

import com.xl.xim.common.algorithm.RouteHandle;
import com.xl.xim.common.enums.StatusEnum;
import com.xl.xim.common.exception.XIMException;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 路由策略， 随机
 *
 * @author: xl
 * @date: 2021/8/5
 **/
public class RandomHandle implements RouteHandle {

    @Override
    public String routeServer(List<String> values, String key) {
        int size = values.size();
        if (size == 0) {
            throw new XIMException(StatusEnum.SERVER_NOT_AVAILABLE);
        }
        int offset = ThreadLocalRandom.current().nextInt(size);

        return values.get(offset);
    }
}
