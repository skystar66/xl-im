package com.xl.xim.client.service;

import com.xl.xim.client.service.impl.command.PrintAllCommand;
import com.xl.xim.client.util.SpringBeanFactory;
import com.xl.xim.common.enums.SystemCommandEnum;
import com.xl.xim.common.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Map;
/**
*
* @author: xl
* @date: 2021/8/5
**/
@Component
public class InnerCommandContext {
    private final static Logger LOGGER = LoggerFactory.getLogger(InnerCommandContext.class);

    /**
     * 获取执行器实例
     * @param command 执行器实例
     * @return
     */
    public InnerCommand getInstance(String command) {

        Map<String, String> allClazz = SystemCommandEnum.getAllClazz();

        //兼容需要命令后接参数的数据 :q cross
        String[] trim = command.trim().split(" ");
        String clazz = allClazz.get(trim[0]);
        InnerCommand innerCommand = null;
        try {
            if (StringUtil.isEmpty(clazz)){
                clazz = PrintAllCommand.class.getName() ;
            }
            innerCommand = (InnerCommand) SpringBeanFactory.getBean(Class.forName(clazz));
        } catch (Exception e) {
            LOGGER.error("Exception", e);
        }

        return innerCommand;
    }

}
