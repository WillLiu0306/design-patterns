package com.lwh.proxy.dynamicproxy.gupaoproxy;

import java.lang.reflect.Method;

/**
 * Created by Tom on 2019/3/10.
 */
public interface GPInvocationHandler {
    Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
