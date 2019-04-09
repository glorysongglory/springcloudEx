package com.hi.webapp.bootstream.controler;

import com.hi.webapp.bootstream.stream.cus.CusProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: sodbvi
 * Date: 2019/4/8
 * Time: 14:10
 **/
@RestController
public class TestCusAction {

    @Autowired
    private CusProvider cusProvider;


    @GetMapping("/sendcus/{msg}")
    public void sendcus(@PathVariable("msg") String msg) {
        cusProvider.send(msg);
    }

}
