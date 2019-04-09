package com.hi.webapp.bootstream.stream.routing;

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
public interface RoutingProcess {
    String INPUT = "routinginput"; // 输入通道名称

    String OUTPUT = "routingoutput"; // 输出通道名称

    @Output(OUTPUT)
    public MessageChannel cusOutput();

    @Input(INPUT)
    public SubscribableChannel input();

}
