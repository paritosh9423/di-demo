package com.paritosh.didemo.controllerTest;

import com.paritosh.didemo.controller.SetterInjectedController;
import com.paritosh.didemo.service.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp(){
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }
    @Test
    public void testSayHello(){
        Assert.assertEquals("Hi Bro....!",setterInjectedController.sayHello());
    }
}
