package com.itheima.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JobTest {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("classpath:application-jobs.xml");
    }
}
