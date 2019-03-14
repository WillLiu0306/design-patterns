package com.lwh.proxy.simpleproxy;

public class RealSubject implements Subject{

    public void request() {
        System.out.println("realSubject get a request");
    }
}
