package com.hi.webapp.bootstream.stream.routing;

import com.hi.webapp.bootstream.stream.cus.CusProcess;
import com.hi.webapp.bootstream.stream.entity.Person;
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
@EnableBinding(RoutingProcess.class)
public class RoutingProvider {

    @Autowired
    @Qualifier("routingoutput")
    private MessageChannel cusOutput;

    public void send(Person person) {
        this.cusOutput.send(MessageBuilder.withPayload(person).build()); // 创建并发送消息
    }
}
