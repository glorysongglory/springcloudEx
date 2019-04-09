package com.hi.webapp.bootstream.stream.entity;

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
@EnableBinding(EntityProcess.class)
public class EntityProvider {

    @Autowired
    @Qualifier("entityoutput")
    private MessageChannel cusOutput;

    public void send(Person person) {
        this.cusOutput.send(MessageBuilder.withPayload(person).build()); // 创建并发送消息
    }
}
