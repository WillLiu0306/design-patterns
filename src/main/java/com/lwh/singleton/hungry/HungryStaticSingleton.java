package com.lwh.singleton.hungry;

public class HungryStaticSingleton {

    private HungryStaticSingleton(){}

    private static HungryStaticSingleton hungrySingleton;

    static {
        hungrySingleton = new HungryStaticSingleton();
    }

    public HungryStaticSingleton getInstance(){
        return hungrySingleton;
    }
}
