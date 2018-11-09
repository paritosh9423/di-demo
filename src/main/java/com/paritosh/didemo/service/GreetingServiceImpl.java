package com.paritosh.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements  GreetingService{

    GreetingRepository greetingRepository;

    public GreetingServiceImpl(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public String sayHello(){
        return "Hi Bro....!";
    }
}
