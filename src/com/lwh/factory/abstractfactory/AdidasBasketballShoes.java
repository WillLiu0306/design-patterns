package com.lwh.factory.abstractfactory;

public class AdidasBasketballShoes implements IBasketballShoes{

    @Override
    public void create() {
        System.out.println("制作阿迪篮球鞋");
    }
}
