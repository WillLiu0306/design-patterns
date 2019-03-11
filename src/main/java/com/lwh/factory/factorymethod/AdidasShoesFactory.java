package com.lwh.factory.factorymethod;

import com.lwh.factory.AdidasShoes;
import com.lwh.factory.IShoes;

public class AdidasShoesFactory implements IShoesFactory{
    @Override
    public IShoes createShoes() {
        return new AdidasShoes();
    }
}
