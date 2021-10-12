package com.xl.im.server.controller;

import com.xl.im.server.server.XIMServer;
import com.xl.xim.common.constant.Constants;
import com.xl.xim.common.enums.StatusEnum;
import com.xl.xim.common.res.BaseResponse;
import com.xl.xim.server.api.ServerApi;
import com.xl.xim.server.api.vo.req.SendMsgReqVO;
import com.xl.xim.server.api.vo.res.SendMsgResVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: xl
 * @date: 2021/8/5
 **/
@Controller
@RequestMapping("/")
public class IndexController implements ServerApi {

    @Autowired
    private XIMServer ximServer;


    /**
     * 统计 service
     */
    @Autowired
    private CounterService counterService;

    /**
     *
     * @param sendMsgReqVO
     * @return
     */
    @Override
    @ApiOperation("Push msg to client")
    @RequestMapping(value = "sendMsg",method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse<SendMsgResVO> sendMsg(@RequestBody SendMsgReqVO sendMsgReqVO){
        BaseResponse<SendMsgResVO> res = new BaseResponse();
        ximServer.sendMsg(sendMsgReqVO) ;

        counterService.increment(Constants.COUNTER_SERVER_PUSH_COUNT);

        SendMsgResVO sendMsgResVO = new SendMsgResVO() ;
        sendMsgResVO.setMsg("OK") ;
        res.setCode(StatusEnum.SUCCESS.getCode()) ;
        res.setMessage(StatusEnum.SUCCESS.getMessage()) ;
        res.setDataBody(sendMsgResVO) ;
        return res ;
    }

}
