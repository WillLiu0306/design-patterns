package com.lwh.factory.abstractfactory;

public class NikeRunningShoes implements IRunningShoes{

    @Override
    public void create() {
        System.out.println("制作耐克跑鞋");
    }
}
