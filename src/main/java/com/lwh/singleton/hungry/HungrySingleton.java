package com.lwh.singleton.hungry;

public class HungrySingleton {
    private HungrySingleton(){}
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    public HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
