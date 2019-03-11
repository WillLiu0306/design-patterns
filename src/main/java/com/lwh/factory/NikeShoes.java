package com.lwh.factory;

public class NikeShoes implements IShoes{
    @Override
    public void createShoes() {
        System.out.println("制作耐克鞋");
    }
}
