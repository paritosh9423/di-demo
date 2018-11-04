package com.paritosh.didemo;

import com.paritosh.didemo.controller.ConstructorInjectedController;
import com.paritosh.didemo.controller.MyController;
import com.paritosh.didemo.controller.PropertyInjectedController;
import com.paritosh.didemo.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext appCtxt = SpringApplication.run(DiDemoApplication.class,args);
        MyController myctrl = (MyController) appCtxt.getBean("myController");
       // myctrl.sayHello();
        System.out.println(myctrl.sayHello());
        System.out.println(appCtxt.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(appCtxt.getBean(SetterInjectedController.class).sayHello());
        System.out.println(appCtxt.getBean(ConstructorInjectedController.class).sayHello());


    }
}
