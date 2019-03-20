package com.lwh.delegate.simple;

public class EmployeeB implements IEmployee{

    public void work(String command) {
        System.out.println("我是小，我擅长架构，我做"+command+"任务");

    }
}
