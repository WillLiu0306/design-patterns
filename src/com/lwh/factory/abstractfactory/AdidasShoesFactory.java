package com.lwh.factory.abstractfactory;

public class AdidasShoesFactory implements IShoesFactory {
    @Override
    public IRunningShoes createRunningShoes() {
        return new AdidasRunningShoes();
    }

    @Override
    public IBasketballShoes createBasketballShoes() {
        return new AdidasBasketballShoes();
    }

    @Override
    public ISoccerShoes createSoccerShoes() {
        return new AdidasSoccerShoes();
    }
}
