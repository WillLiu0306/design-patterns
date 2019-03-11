package com.lwh.singleton.register;

/**
 * 枚举 可 防止反射和反序列化破环单例
 */
public enum EnumSingleton {
    INSTANCE;

    private Object data;

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
