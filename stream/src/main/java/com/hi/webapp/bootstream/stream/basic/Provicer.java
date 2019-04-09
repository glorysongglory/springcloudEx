package com.hi.webapp.bootstream.stream.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

/**
 * Created by IntelliJ IDEA.
 * User: sodbvi
 * Date: 2019/4/8
 * Time: 13:15
 **/
@EnableBinding(Source.class)
public class Provicer {
    @Autowired
    @Qualifier("output")
    private MessageChannel output; // 消息的发送管道

    public void send(String msg) {
        this.output.send(MessageBuilder.withPayload(msg).build()); // 创建并发送消息
    }
}
