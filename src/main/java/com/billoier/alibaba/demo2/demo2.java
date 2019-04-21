package com.billoier.alibaba.demo2;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo2 {

    @Test
    public void demo2() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Man man = (Man) context.getBean("man");
        man.myRun();



        context.close();
    }

    @Test
    public void demo3() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserDao userDao = (UserDao) context.getBean("userDao");
        userDao.findAll();

    }

}
