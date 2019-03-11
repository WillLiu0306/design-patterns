package com.lwh.singleton.register;

import com.lwh.singleton.ConcurrentExecutor;

public class ContainerSingletonTest {
    public static void main(String[] args) {
        try {
            ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
                public void handler() {

                    Object obj = ContainerSingleton.getInstance("com.lwh.singleton.Pojo");
                    System.out.println(System.currentTimeMillis() + ": " + obj);
                }
            },10,6);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
