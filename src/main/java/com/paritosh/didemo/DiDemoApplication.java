package com.paritosh.didemo;

import com.paritosh.didemo.controller.ConstructorInjectedController;
import com.paritosh.didemo.controller.MyController;
import com.paritosh.didemo.controller.PropertyInjectedController;
import com.paritosh.didemo.controller.SetterInjectedController;
import com.paritosh.didemo.fakeBeans.FakeDataSource;
import com.paritosh.didemo.fakeBeans.FakeJMSBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext appCtxt = SpringApplication.run(DiDemoApplication.class,args);
        MyController myctrl = (MyController) appCtxt.getBean("myController");
       // myctrl.sayHello();
       // System.out.println(myctrl.sayHello());
        //System.out.println(appCtxt.getBean(PropertyInjectedController.class).sayHello());
        //System.out.println(appCtxt.getBean(SetterInjectedController.class).sayHello());
        //System.out.println(appCtxt.getBean(ConstructorInjectedController.class).sayHello());
        FakeDataSource fakeDataSource = (FakeDataSource) appCtxt.getBean(FakeDataSource.class);
        System.out.println("USERNAME: "+fakeDataSource.getDbUsername());

        FakeJMSBroker fakeJMSBroker = (FakeJMSBroker) appCtxt.getBean(FakeJMSBroker.class);
        System.out.println(fakeJMSBroker.getUsername());

    }
}
