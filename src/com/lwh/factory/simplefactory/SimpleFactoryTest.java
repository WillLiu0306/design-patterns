package com.lwh.factory.simplefactory;

import com.lwh.factory.AdidasShoes;
import com.lwh.factory.IShoes;
import com.lwh.factory.NikeShoes;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        ShoesFactory shoesFactory = new ShoesFactory();
        IShoes shoes = shoesFactory.createByBrandName("Nike");
        shoes.createShoes();
        shoes = shoesFactory.createByBrandName("Adidas");
        shoes.createShoes();

        shoes = shoesFactory.createByClass(NikeShoes.class);
        shoes.createShoes();
        shoes = shoesFactory.createByClass(AdidasShoes.class);
        shoes.createShoes();
    }
}
