package com.lwh.factory.abstractfactory;

import com.lwh.factory.IShoes;

public interface IShoesFactory {
    IRunningShoes createRunningShoes();

    IBasketballShoes createBasketballShoes();

    ISoccerShoes createSoccerShoes();
}
