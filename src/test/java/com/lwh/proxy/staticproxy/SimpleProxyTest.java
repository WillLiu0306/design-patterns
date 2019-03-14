package com.lwh.proxy.staticproxy;

public class SimpleProxyTest {
    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findLove();
    }
}
