package com.hi.webapp.bootstream.stream.group;

import com.hi.webapp.bootstream.stream.cus.CusProcess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

/**
 * Created by IntelliJ IDEA.
 * User: sodbvi
 * Date: 2019/4/8
 * Time: 15:25
 **/
@EnableBinding(CusProcess.class)
public class GroupProvider {

    @Autowired
    @Qualifier("groupoutput")
    private MessageChannel cusOutput;

    public void send(String msg) {
        this.cusOutput.send(MessageBuilder.withPayload(msg).build()); // 创建并发送消息
    }
}
