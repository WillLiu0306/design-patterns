package com.lwh.singleton.lazy;

import com.lwh.singleton.ExecutorThread;

public class LazySimpleSingletonTest {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ExecutorThread(LazySimpleSingleton.class));
        Thread thread2 = new Thread(new ExecutorThread(LazySimpleSingleton.class));
        thread1.start();
        thread2.start();

    }

}
