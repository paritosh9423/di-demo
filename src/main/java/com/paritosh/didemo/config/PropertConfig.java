package com.paritosh.didemo.config;

import com.paritosh.didemo.fakeBeans.FakeDataSource;
import com.paritosh.didemo.fakeBeans.FakeJMSBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
//@PropertySource({"classpath:datasource.properties","classpath:jmsSpecific.properties"})
/*@PropertySources({
    @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jmsSpecific.properties")
})*/
public class PropertConfig {
    @Value("${com.paritosh.db.username}")
    String dbUsername;
    @Value("${com.paritosh.db.password}")
    String dbPassword;
    @Value("${com.paritosh.db.dburl}")
    String dbUrl;

    @Value("${com.paritosh.jms.username}")
    String jmsUsername;
    @Value("${com.paritosh.jms.password}")
    String jmsPassword;
    @Value("${com.paritosh.jms.url}")
    String jmsUrl;

    @Bean
    public FakeJMSBroker fakeJMSBroker(){
        FakeJMSBroker fakeJMSBroker = new FakeJMSBroker();
        fakeJMSBroker.setUsername(jmsUsername);
        fakeJMSBroker.setPassword(jmsPassword);
        fakeJMSBroker.setUrl(jmsUrl);
        return fakeJMSBroker;
    }

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setDbUsername(dbUsername);
        fakeDataSource.setDbPassword(dbPassword);
        fakeDataSource.setDbUrl(dbUrl);
        return fakeDataSource;
    }
    /*@Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }*/
}
