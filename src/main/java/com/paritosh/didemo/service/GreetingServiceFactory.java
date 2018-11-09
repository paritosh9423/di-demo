package com.paritosh.didemo.service;

public class GreetingServiceFactory {

private  GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingSrvice(String lang){
        switch (lang) {
            case "en":
                return new PrimaryService(greetingRepository);
            case "de":
                return new PrimaryGermanGreetingServiceImpl(greetingRepository);
            case "es":
                return new PrimarySpanishGreetingService(greetingRepository);
            default:
                return new GreetingServiceImpl(greetingRepository);
        }
    }
}
