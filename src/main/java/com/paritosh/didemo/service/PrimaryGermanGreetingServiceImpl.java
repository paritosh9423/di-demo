package com.paritosh.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
//
//@Service
//@Primary
//@Profile("p2.german")
public class PrimaryGermanGreetingServiceImpl implements GreetingService {

    GreetingRepository greetingRepository;

    public PrimaryGermanGreetingServiceImpl(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayHello() {
        return "German Hello";
    }
}
