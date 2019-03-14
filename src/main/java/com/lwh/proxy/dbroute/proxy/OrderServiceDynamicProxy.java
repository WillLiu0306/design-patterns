package com.lwh.proxy.dbroute.proxy;

import com.lwh.proxy.dbroute.db.DynamicDatasourceEntity;
import com.lwh.proxy.dynamicproxy.gupaoproxy.GPClassLoader;
import com.lwh.proxy.dynamicproxy.gupaoproxy.GPInvocationHandler;
import com.lwh.proxy.dynamicproxy.gupaoproxy.GPProxy;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderServiceDynamicProxy implements GPInvocationHandler {

    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");


    private Object target;

    public Object getInstance(Object target){
        this.target = target;
        Class clazz = target.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(), clazz.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args)throws Exception{
        before(args[0]);
        Object object = method.invoke(this.target, args);
        after();
        return object;
    }

    public void before(Object target){
        try {
            System.out.println("before");
            Long time = (Long)target.getClass().getMethod("getCreateTime").invoke(target);
            int year = Integer.valueOf(yearFormat.format(new Date(time)));
            DynamicDatasourceEntity.set(year);
            System.out.println(DynamicDatasourceEntity.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void after(){
        System.out.println("proxy after");
        DynamicDatasourceEntity.restore();
    }
}
