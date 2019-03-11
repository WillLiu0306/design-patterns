package com.lwh.factory.abstractfactory;

public class AdidasRunningShoes implements IRunningShoes {

    @Override
    public void create() {
        System.out.println("制作阿迪跑鞋");
    }
}
