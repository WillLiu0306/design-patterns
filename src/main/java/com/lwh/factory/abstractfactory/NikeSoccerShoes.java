package com.lwh.factory.abstractfactory;

public class NikeSoccerShoes implements ISoccerShoes {

    @Override
    public void create() {
        System.out.println("制作耐克足球鞋");
    }
}
