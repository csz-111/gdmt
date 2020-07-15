package com.isoftstone.gdmt.util;

import org.aspectj.lang.ProceedingJoinPoint;

public class Advice {

    public void before() {
        System.out.println("before......");
    }

    public void after() {
        System.out.println("after.......");
    }

    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before........");
        Object obj = pjp.proceed();
        System.out.println("arund after........");
        return obj;
    }

    public void exception() {
        System.out.println("exception......");
    }
}
