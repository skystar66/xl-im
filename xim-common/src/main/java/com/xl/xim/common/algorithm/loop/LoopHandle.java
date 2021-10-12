package com.xl.xim.common.algorithm.loop;

import com.xl.xim.common.algorithm.RouteHandle;
import com.xl.xim.common.enums.StatusEnum;
import com.xl.xim.common.exception.XIMException;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author: xl
 * @date: 2021/8/5
 **/
public class LoopHandle implements RouteHandle {
    private AtomicLong index = new AtomicLong();

    @Override
    public String routeServer(List<String> values, String key) {
        if (values.size() == 0) {
            throw new XIMException(StatusEnum.SERVER_NOT_AVAILABLE);
        }
        Long position = index.incrementAndGet() % values.size();
        if (position < 0) {
            position = 0L;
        }

        return values.get(position.intValue());
    }
}
