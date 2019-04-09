package com.hi.webapp.bootstream.stream.group;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * Created by IntelliJ IDEA.
 * User: sodbvi
 * Date: 2019/4/8
 * Time: 15:23
 **/
public interface GroupProcess {
    String INPUT = "groupinput"; // 输入通道名称

    String OUTPUT = "groupoutput"; // 输出通道名称

    @Output(OUTPUT)
    public MessageChannel cusOutput();

    @Input(INPUT)
    public SubscribableChannel input();

}
