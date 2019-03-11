package com.lwh.factory;

public class AdidasShoes implements IShoes{
    @Override
    public void createShoes() {
        System.out.println("制作阿迪达斯鞋");
    }
}
