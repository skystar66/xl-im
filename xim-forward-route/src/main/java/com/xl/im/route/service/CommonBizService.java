package com.xl.im.route.service;

import com.xl.im.route.cache.ServerCache;
import com.xl.im.route.kit.NetAddressIsReachable;
import com.xl.xim.common.enums.StatusEnum;
import com.xl.xim.common.exception.XIMException;
import com.xl.xim.common.pojo.RouteInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @author: xl
 * @date: 2021/8/5
 **/
@Component
public class CommonBizService {
    private static Logger logger = LoggerFactory.getLogger(CommonBizService.class);


    @Autowired
    private ServerCache serverCache;

    /**
     * check ip and port
     *
     * @param routeInfo
     */
    public void checkServerAvailable(RouteInfo routeInfo) {
        boolean reachable = NetAddressIsReachable.checkAddressReachable(routeInfo.getIp(), routeInfo.getXimServerPort(), 1000);
        if (!reachable) {
            logger.error("ip={}, port={} are not available", routeInfo.getIp(), routeInfo.getXimServerPort());

            // rebuild cache
            serverCache.rebuildCacheList();

            throw new XIMException(StatusEnum.SERVER_NOT_AVAILABLE);
        }

    }
}
