package com.paritosh.didemo.controllerTest;

import com.paritosh.didemo.controller.ConstructorInjectedController;
import com.paritosh.didemo.service.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp(){
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }
    @Test
    public void testSayHello(){
        Assert.assertEquals("Hi Bro....!",this.constructorInjectedController.sayHello());
    }
}

