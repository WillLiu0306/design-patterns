package com.lwh.singleton.threadlocal;

import com.lwh.singleton.ExecutorThread;

public class ThreadLocalSingletonTest {
    public static void main(String[] args) {
        ThreadLocalSingleton threadLocalSingleton = ThreadLocalSingleton.getInstance();
        System.out.println(threadLocalSingleton);

        Thread thread = new Thread(new ExecutorThread(ThreadLocalSingleton.class));

        Thread thread2 = new Thread(new ExecutorThread(ThreadLocalSingleton.class));

        thread.start();
        thread2.start();

    }
}
