package com.lwh.factory.abstractfactory;


public class AbstractFactoryTest {

    public static void main(String[] args) {
        IShoesFactory shoesFactory = new NikeShoesFactory();
        shoesFactory.createBasketballShoes().create();
        shoesFactory.createRunningShoes().create();
        shoesFactory.createSoccerShoes().create();

        IShoesFactory adiShoesFactory = new AdidasShoesFactory();
        adiShoesFactory.createBasketballShoes().create();
        adiShoesFactory.createRunningShoes().create();
        adiShoesFactory.createSoccerShoes().create();
    }
}
