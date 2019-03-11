package com.lwh.singleton.lazy;

public class LazySimpleSingleton {

    private LazySimpleSingleton(){}

    private static LazySimpleSingleton  lazySimpleSingleton = null;

    public static synchronized LazySimpleSingleton getInstance(){
        if (lazySimpleSingleton == null){
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
}
