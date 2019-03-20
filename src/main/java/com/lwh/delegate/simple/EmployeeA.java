package com.lwh.delegate.simple;

public class EmployeeA implements IEmployee{

    public void work(String command) {
        System.out.println("我是小A，我擅长加密，我做"+command+"任务");
    }
}
