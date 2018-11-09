package com.paritosh.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Service
//@Primary
//@Profile({"p2.english", "default"})
public class PrimaryService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayHello() {
        return greetingRepository.getEnglishGreeting();
    }
}
