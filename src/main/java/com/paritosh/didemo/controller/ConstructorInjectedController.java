package com.paritosh.didemo.controller;

import com.paritosh.didemo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private GreetingService greetingService;
@Autowired

//Spring automatically wires constructor DI since spring 4.2 but its good practice to give autowired on constructor for uderstanding purpose.
    public ConstructorInjectedController(@Qualifier("constructorGreetingServiceImpl")GreetingService greetingService){
        this.greetingService = greetingService;
    }
    public String sayHello(){
        return greetingService.sayHello();
    }
}
