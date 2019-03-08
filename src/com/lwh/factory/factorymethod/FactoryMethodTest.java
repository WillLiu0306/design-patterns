package com.lwh.factory.factorymethod;

import com.lwh.factory.IShoes;

public class FactoryMethodTest {
    public static void main(String[] args) {
        IShoesFactory shoesFactory = new NikeShoesFactory();
        IShoes nikeShoes = shoesFactory.createShoes();
        nikeShoes.createShoes();

        shoesFactory = new AdidasShoesFactory();
        IShoes adiShoes = shoesFactory.createShoes();
        adiShoes.createShoes();
    }
}
