package com.lwh.factory.abstractfactory;

public interface IShoesFactory {
    IRunningShoes createRunningShoes();

    IBasketballShoes createBasketballShoes();

    ISoccerShoes createSoccerShoes();
}
