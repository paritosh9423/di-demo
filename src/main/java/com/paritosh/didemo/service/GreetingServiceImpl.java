package com.paritosh.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements  GreetingService{

    public String sayHello(){
        return "Hi Bro....!";
    }
}
