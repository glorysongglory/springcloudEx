package com.hi.webapp.bootstream.stream.entity;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: sodbvi
 * Date: 2019/4/8
 * Time: 15:27
 **/
@Component
@EnableBinding(EntityProcess.class)
public class EntityConsumer {

    @StreamListener(EntityProcess.INPUT)
    public void input(Person person) {
        System.err.println("【*** 消息接收entity ***】");
        System.out.println("age：" + person.getAge());
        System.out.println("name：" + person.getName());
        System.out.println("birthday：" + person.getBirthday());

    }

}
