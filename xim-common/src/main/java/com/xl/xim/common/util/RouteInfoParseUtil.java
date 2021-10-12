package com.xl.xim.common.util;

import com.xl.xim.common.enums.StatusEnum;
import com.xl.xim.common.exception.XIMException;
import com.xl.xim.common.pojo.RouteInfo;


/**
 * @author: xl
 * @date: 2021/8/5
 **/
public class RouteInfoParseUtil {

    public static RouteInfo parse(String info){
        try {
            String[] serverInfo = info.split(":");
            RouteInfo routeInfo =  new RouteInfo(serverInfo[0], Integer.parseInt(serverInfo[1]),Integer.parseInt(serverInfo[2])) ;
            return routeInfo ;
        }catch (Exception e){
            throw new XIMException(StatusEnum.VALIDATION_FAIL) ;
        }
    }
}
