package com.lwh.singleton.lazy;

import com.lwh.singleton.ExecutorThread;

public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ExecutorThread(LazyInnerClassSingleton.class));
        Thread thread2 = new Thread(new ExecutorThread(LazyInnerClassSingleton.class));
        thread1.start();
        thread2.start();

    }

}
