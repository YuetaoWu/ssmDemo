package com.billoier.alibaba.demo4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo4 {

    @Test
    public void demo4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("annoApplicationContext.xml");

        UserService userService = (UserService) context.getBean("userService");

        System.out.println(userService.syaHello("Chelsea"));

    }
}
