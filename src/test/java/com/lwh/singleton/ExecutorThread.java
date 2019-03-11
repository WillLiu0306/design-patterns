package com.lwh.singleton;

import com.lwh.singleton.lazy.LazySimpleSingleton;

import java.lang.reflect.InvocationTargetException;

public class ExecutorThread implements Runnable{
    private Class clazz;
    public ExecutorThread(Class clazz){
        this.clazz = clazz;
    }

    public void run() {
//        LazySimpleSingleton.class.getMethod("getInstance").invoke();
//        LazySimpleSingleton lazySimpleSingleton = LazySimpleSingleton.getInstance();
//        System.out.println(Thread.currentThread().getName()+":"+lazySimpleSingleton);

        try {
            Object o = clazz.getMethod("getInstance").invoke(null);
            System.out.println(Thread.currentThread().getName()+":"+o);
        } catch (Exception e) {

        }
    }
}
