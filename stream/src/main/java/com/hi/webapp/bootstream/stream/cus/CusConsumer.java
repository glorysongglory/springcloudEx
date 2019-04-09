package com.hi.webapp.bootstream.stream.cus;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: sodbvi
 * Date: 2019/4/8
 * Time: 15:27
 **/
@Component
@EnableBinding(CusProcess.class)
public class CusConsumer {

    @StreamListener(CusProcess.INPUT)
    public void input(Message<String> message) {
        System.err.println("【*** 消息接收cus ***】" + message.getPayload());
    }

}
