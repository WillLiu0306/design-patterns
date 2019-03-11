package com.lwh.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {

    private ContainerSingleton(){}

    private static Map<String,Object>ioc = new ConcurrentHashMap<String, Object>();

    public static Object getInstance(String className){

        synchronized (ioc) {
            if (!ioc.containsKey(className)){
                Object object = null;
                try{
                    object = Class.forName(className).newInstance();

                }catch(Exception e){

                }

                ioc.put(className, object);
                return object;
            } else {
                return ioc.get(className);
            }
        }

    }
}
