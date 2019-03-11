package com.lwh.singleton.seriable;

import java.io.Serializable;

public class SeriableSingleton implements Serializable {
    private static final SeriableSingleton instance = new SeriableSingleton();

    private SeriableSingleton(){}

    public static SeriableSingleton getInstance(){
        return instance;
    }

    private Object readResolve(){
        return instance;
    }
}
