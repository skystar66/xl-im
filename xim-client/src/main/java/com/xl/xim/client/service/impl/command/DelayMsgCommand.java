package com.xl.xim.client.service.impl.command;

import com.vdurmont.emoji.EmojiParser;
import com.xl.xim.client.service.EchoService;
import com.xl.xim.client.service.InnerCommand;
import com.xl.xim.client.service.MsgHandle;
import com.xl.xim.common.construct.RingBufferWheel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: xl
 * @date: 2021/8/5
 **/
@Service
public class DelayMsgCommand implements InnerCommand {

    @Autowired
    private EchoService echoService;

    @Autowired
    private MsgHandle msgHandle;

    @Autowired
    private RingBufferWheel ringBufferWheel;

    @Override
    public void process(String msg) {
        if (msg.split(" ").length <= 2) {
            echoService.echo("incorrect commond, :delay [msg] [delayTime]");
            return;
        }

        String message = msg.split(" ")[1];
        Integer delayTime = Integer.valueOf(msg.split(" ")[2]);

        RingBufferWheel.Task task = new DelayMsgJob(message);
        task.setKey(delayTime);
        ringBufferWheel.addTask(task);
        echoService.echo(EmojiParser.parseToUnicode(msg));
    }


    private class DelayMsgJob extends RingBufferWheel.Task {

        private String msg;

        public DelayMsgJob(String msg) {
            this.msg = msg;
        }

        @Override
        public void run() {
            msgHandle.sendMsg(msg);
        }
    }
}
