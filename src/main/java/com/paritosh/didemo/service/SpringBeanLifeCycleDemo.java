package com.paritosh.didemo.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
public class SpringBeanLifeCycleDemo implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }

    public SpringBeanLifeCycleDemo() {
        System.out.println("SpringBeanLifeCycleDemo Constructor");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name "+s + "from"+" setBeanName(String s)");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("SpringBeanLifeCycleDemo has been destroyed "+ ": destroy() called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SpringBeanLifeCycleDemo has its properties set "+ ": afterPropertiesSet() called");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContext is setup ,setApplicationContext() called ");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Post constructed annotated methd is called ");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("PreDestroy is called");
    }

    public void beforeInit(){
        System.out.println("BEFORE INIT -- CALLED BY BEAN POST PROCESSOR");
    }
    public void afterInit(){
        System.out.println("AFTER INIT -- CALLED BY BEAN POST PROCESSOR");
    }
}
