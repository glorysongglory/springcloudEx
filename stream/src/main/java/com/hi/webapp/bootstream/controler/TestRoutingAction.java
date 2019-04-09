package com.hi.webapp.bootstream.controler;

import com.hi.webapp.bootstream.stream.entity.Person;
import com.hi.webapp.bootstream.stream.routing.RoutingProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: sodbvi
 * Date: 2019/4/8
 * Time: 14:10
 **/
@RestController
public class TestRoutingAction {

    @Autowired
    private RoutingProvider routingProvider;


    @GetMapping("/sendrouting")
    public void sendcus() {
        Person person = new Person();
        person.setAge(1);
        person.setName("abc");
        person.setBirthday(new Date());
        routingProvider.send(person);
    }

}
