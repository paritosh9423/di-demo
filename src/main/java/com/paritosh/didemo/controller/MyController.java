package com.paritosh.didemo.controller;

import com.paritosh.didemo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    @Autowired
private GreetingService greetingService;
    public String sayHello(){
       // System.out.println("Hello Buddy!!!!");
     return   greetingService.sayHello();
    }
}
