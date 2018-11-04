package com.paritosh.didemo.controller;

import com.paritosh.didemo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
@Autowired
@Qualifier("propertiesGreetingServiceImpl")
    public GreetingService greetingService ;
    public String sayHello(){
       return getGreetingServiceImpl().sayHello();
    }
    public GreetingService getGreetingServiceImpl(){
        return greetingService;
    }

}
