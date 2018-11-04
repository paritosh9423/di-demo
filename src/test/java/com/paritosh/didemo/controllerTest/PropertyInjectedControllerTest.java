package com.paritosh.didemo.controllerTest;

import com.paritosh.didemo.controller.PropertyInjectedController;
import com.paritosh.didemo.service.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception{
        this.propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testSayHello() throws Exception{

        Assert.assertEquals("Hi Bro....!",propertyInjectedController.sayHello());

    }
}
