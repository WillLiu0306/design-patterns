package com.lwh.factory.abstractfactory;

public class NikeShoesFactory implements IShoesFactory {
    @Override
    public IRunningShoes createRunningShoes() {
        return new NikeRunningShoes();
    }

    @Override
    public IBasketballShoes createBasketballShoes() {
        return new NikeBasketballShoes();
    }

    @Override
    public ISoccerShoes createSoccerShoes() {
        return new NikeSoccerShoes();
    }
}
