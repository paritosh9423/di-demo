package com.paritosh.didemo.service;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hi in ENGLISH!!";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hi in spanish!!";
    }

    @Override
    public String getGermanGreeting() {
        return "Hi in German!!";
    }
}
