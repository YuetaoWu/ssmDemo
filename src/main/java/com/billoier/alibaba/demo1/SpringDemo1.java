package com.billoier.alibaba.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo1 {


    public void demo1() {
        UserService service = new UserServiceImpl();

        service.sayHello();
    }

    @Test
    public void demo2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService service = (UserService)context.getBean("userService");

        service.sayHello();
    }

}
