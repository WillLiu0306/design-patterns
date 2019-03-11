package com.lwh.singleton.lazy;

public class LazyDoubleCheckSingleton {
    private LazyDoubleCheckSingleton(){}

    private static  LazyDoubleCheckSingleton instance;

    public static final LazyDoubleCheckSingleton getInstance(){
        if (instance == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if (instance == null){
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
