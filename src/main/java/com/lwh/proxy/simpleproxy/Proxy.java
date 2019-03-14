package com.lwh.proxy.simpleproxy;

public class Proxy {
    private Subject subject;

    public Proxy(Subject subject){
        this.subject = subject;
    }

    public void doRequest(){
        this.subject.request();
    }
}
