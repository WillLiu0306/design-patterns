package com.lwh.factory.abstractfactory;

public class NikeBasketballShoes implements IBasketballShoes{

    @Override
    public void create() {
        System.out.println("制作耐克篮球鞋");
    }
}
