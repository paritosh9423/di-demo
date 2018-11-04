package com.paritosh.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext appCtxt = SpringApplication.run(DiDemoApplication.class,args);
        MyController myctrl = (MyController) appCtxt.getBean("myController");
        myctrl.sayHello();
    }
}
