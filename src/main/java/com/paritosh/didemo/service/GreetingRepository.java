package com.paritosh.didemo.service;

import org.springframework.context.annotation.Bean;

public interface GreetingRepository {
    String getEnglishGreeting();
    String getSpanishGreeting();
    String getGermanGreeting();

}
