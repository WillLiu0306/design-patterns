package com.lwh.singleton.lazy;

import java.lang.reflect.Constructor;

public class InvokeReflectTest {
    public static void main(String[] args) {
        try {
            Constructor constructor = LazyInnerClassSingleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            LazyInnerClassSingleton reflect = (LazyInnerClassSingleton)constructor.newInstance();

            LazyInnerClassSingleton lazyInnerClassSingleton = LazyInnerClassSingleton.getInstance();

            System.out.println(lazyInnerClassSingleton == reflect);

            //这种懒汉式 反射先于 LazySimpleSingleton.getInstance() 则不能做到之生成一个对象
           /* Constructor constructor = LazySimpleSingleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            LazySimpleSingleton reflect = (LazySimpleSingleton)constructor.newInstance();

            LazySimpleSingleton lazyInnerClassSingleton = LazySimpleSingleton.getInstance();

            System.out.println(lazyInnerClassSingleton == reflect);*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
