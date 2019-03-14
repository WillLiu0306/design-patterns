package com.lwh.proxy.dynamicproxy.JdkProxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JDKProxyTest {
    public static void main(String[] args) {
        try {
            Object object = new JDKMeiPo().getInstance(new Gril());
            Method method = object.getClass().getMethod("findLove",null);
            method.invoke(object);
        } catch (Exception e) {

        }
    }
}
