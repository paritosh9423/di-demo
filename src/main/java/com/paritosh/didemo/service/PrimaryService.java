package com.paritosh.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello from "+this.getClass().getName();
    }
}
