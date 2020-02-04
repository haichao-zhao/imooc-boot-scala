package com.zhc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloBoot {
    @RequestMapping(value = "/sayJavaHello",method = RequestMethod.GET)
    public String sayJavaHello(){
        return "Hello Java boot...";
    }
}
