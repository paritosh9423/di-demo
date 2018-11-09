package com.paritosh.didemo.config;

import com.paritosh.didemo.service.GreetingRepository;
import com.paritosh.didemo.service.GreetingService;
import com.paritosh.didemo.service.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServieConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository){
        return new GreetingServiceFactory(greetingRepository);
    }

    @Bean
    @Primary
    @Profile({"default","en"})
    GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingSrvice("en");
    }

    @Bean
    @Primary
    @Profile({"es"})
    GreetingService spanishGreetingService(GreetingServiceFactory greetingServiceFactory)
    {
        return greetingServiceFactory.createGreetingSrvice("es");
    }
    @Bean
    @Primary
    @Profile({"de"})
    GreetingService germaGreetingService(GreetingServiceFactory greetingServiceFactory)
    {
        return greetingServiceFactory.createGreetingSrvice("de");
    }
}
