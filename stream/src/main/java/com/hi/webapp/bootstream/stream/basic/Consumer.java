package com.hi.webapp.bootstream.stream.basic;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: sodbvi
 * Date: 2019/4/8
 * Time: 13:23
 **/
@Component
@EnableBinding(Sink.class)
public class Consumer {

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message) {
        System.err.println("【*** 消息接收 ***】" + message.getPayload());
    }
}
