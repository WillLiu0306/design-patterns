package com.lwh.singleton.lazy;

public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton(){
        if (SingletonHolder.lazyInnerClassSingleton!=null){
            throw new RuntimeException("不允许生成多个实例！");
        }
    }

    //final 限制重写、重载
    public static final LazyInnerClassSingleton getInstance(){
        return SingletonHolder.lazyInnerClassSingleton;
    }

    private static class SingletonHolder{
        private static LazyInnerClassSingleton lazyInnerClassSingleton = new LazyInnerClassSingleton();
    }
}
