package com.lwh.proxy.dynamicproxy.JdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKMeiPo implements InvocationHandler {

    private Object target;
    public Object getInstance(Object person) throws Exception{
        this.target = person;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

/*    public Object getInstance(Class clazz){
        before();
        Object o = Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
        after();
        return o;
    }*/

    public Object invoke(Object proxy, Method method, Object[] args) throws Exception{
        before();
        Object object = method.invoke(this.target,args);
        after();
        return  object;
    }

    private void before(){
        System.out.println("我是媒婆，我要给你找对象，现在已经确认你的需求");
        System.out.println("开始物色");
    }

    private void after(){
        System.out.println("OK的话，准备办事");
    }
}
