package com.paritosh.didemo.controller;

import com.paritosh.didemo.service.GreetingServiceImpl;

public class PropertyInjectedController {

    public GreetingServiceImpl greetingServiceImpl ;
    public String sayHello(){
       return getGreetingServiceImpl().sayHello();
    }
    public GreetingServiceImpl getGreetingServiceImpl(){
        return greetingServiceImpl;
    }

}
