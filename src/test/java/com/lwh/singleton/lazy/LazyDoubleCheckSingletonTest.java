package com.lwh.singleton.lazy;

import com.lwh.singleton.ExecutorThread;

public class LazyDoubleCheckSingletonTest {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ExecutorThread(LazyDoubleCheckSingleton.class));
        Thread thread2 = new Thread(new ExecutorThread(LazyDoubleCheckSingleton.class));
        thread1.start();
        thread2.start();

    }

}
