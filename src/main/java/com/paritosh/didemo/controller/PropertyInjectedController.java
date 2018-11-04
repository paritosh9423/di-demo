package com.paritosh.didemo.controller;

import com.paritosh.didemo.service.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
@Autowired
    public GreetingServiceImpl greetingServiceImpl ;
    public String sayHello(){
       return getGreetingServiceImpl().sayHello();
    }
    public GreetingServiceImpl getGreetingServiceImpl(){
        return greetingServiceImpl;
    }

}
