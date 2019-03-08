package com.lwh.factory.abstractfactory;

public class AdidasSoccerShoes implements ISoccerShoes{

    @Override
    public void create() {
        System.out.println("制作阿迪足球鞋");
    }
}
