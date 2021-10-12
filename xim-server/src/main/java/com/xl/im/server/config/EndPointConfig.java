package com.xl.im.server.config;

import com.xl.im.server.endpoint.CustomEndpoint;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: xl
 * @date: 2021/8/5
 **/
@Configuration
public class EndPointConfig {


    @Value("${monitor.channel.map.key}")
    private String channelMap;

    @Bean
    public CustomEndpoint buildEndPoint(){
        CustomEndpoint customEndpoint = new CustomEndpoint(channelMap) ;
        return customEndpoint ;
    }
}
