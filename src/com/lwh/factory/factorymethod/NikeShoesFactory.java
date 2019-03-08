package com.lwh.factory.factorymethod;

import com.lwh.factory.IShoes;
import com.lwh.factory.NikeShoes;

public class NikeShoesFactory implements IShoesFactory{
    @Override
    public IShoes createShoes() {
        return new NikeShoes();
    }
}
