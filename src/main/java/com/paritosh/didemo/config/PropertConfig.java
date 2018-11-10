package com.paritosh.didemo.config;

import com.paritosh.didemo.fakeBeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertConfig {
    @Value("${com.paritosh.db.username}")
    String dbUsername;
    @Value("${com.paritosh.db.password}")
    String dbPassword;
    @Value("${com.paritosh.db.dburl}")
    String dbUrl;
    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setDbUsername(dbUsername);
        fakeDataSource.setDbPassword(dbPassword);
        fakeDataSource.setDbUrl(dbUrl);
        return fakeDataSource;
    }
    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
