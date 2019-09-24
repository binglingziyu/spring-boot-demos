package com.ihubin.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = {
//        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
//})
@SpringBootApplication
public class SpringSecurity01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurity01Application.class, args);
    }

}
