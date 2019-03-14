package com.lwh.proxy.dbroute.db;

public class DynamicDatasourceEntity {

    private static final String DEFAULT = null;

    private static final ThreadLocal<String> threadLocal = new ThreadLocal<String>();

    public static void set(String data){
        threadLocal.set(data);
    }

    public static void set(int year){threadLocal.set("DB_" + year);}

    public static String get(){
        return threadLocal.get();
    }

    public static void restore(){
        threadLocal.set(DEFAULT);
    }
}
