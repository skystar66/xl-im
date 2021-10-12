package com.xl.xim.client.service.impl.command;

import com.xl.xim.client.service.EchoService;
import com.xl.xim.client.service.InnerCommand;
import com.xl.xim.client.service.impl.ClientInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: xl
 * @date: 2021/8/5
 **/
@Service
public class EchoInfoCommand implements InnerCommand {
    private final static Logger LOGGER = LoggerFactory.getLogger(EchoInfoCommand.class);


    @Autowired
    private ClientInfo clientInfo;

    @Autowired
    private EchoService echoService;

    @Override
    public void process(String msg) {
        echoService.echo("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        echoService.echo("client info={}", clientInfo.get().getUserName());
        echoService.echo("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
