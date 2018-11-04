package com.paritosh.didemo.controller;

import com.paritosh.didemo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayHello();
    }
@Autowired
@Qualifier("setterGreetingServiceImpl")
    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }
}
