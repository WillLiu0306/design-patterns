package com.lwh.proxy.dynamicproxy.gupaoproxy;

import java.lang.reflect.Method;


public class GPMeiPo implements GPInvocationHandler{
    private Object target;
    public Object getInstance(Object person) throws Exception{
        this.target = person;
        Class clazz = this.target.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(),clazz.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object object = method.invoke(this.target,args);
        after();
        return object;
    }

    public void before(){
        System.out.println("我是媒婆，说出你的需求，帮你物色");
    }

    public void after(){
        System.out.println("谈妥，办事");
    }
}
