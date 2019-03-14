package com.lwh.proxy.dynamicproxy.gupaoproxy;

import com.lwh.proxy.Person;
import com.lwh.proxy.dynamicproxy.JdkProxy.Gril;

public class GPProxyTest {
    public static void main(String[] args) {
        try {
            //JDK动态代理的实现原理
            Person obj = (Person) new GPMeiPo().getInstance(new Gril());
            System.out.println(obj.getClass());
            obj.findLove();
        } catch (Exception e) {

        }
    }
}
