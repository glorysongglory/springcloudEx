package com.sodbvi.securitybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: sodbvi
 * Date: 2018-09-04 -10:28
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String getUsers() {
        return "Hello Spring Security";
    }

}
