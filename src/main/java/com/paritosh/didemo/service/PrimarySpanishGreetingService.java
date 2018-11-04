package com.paritosh.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("p2.spanish")
@Primary
public class PrimarySpanishGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello in Spanish ";
    }
}
