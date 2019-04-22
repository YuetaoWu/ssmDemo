package com.billoier.alibaba.demo4;

import org.springframework.stereotype.Component;

@Component("userService")
public class UserService {

    String syaHello(String name) {
        return "Hello " + name;
    }
}
