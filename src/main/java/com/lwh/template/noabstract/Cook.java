package com.lwh.template.noabstract;

public interface Cook {

    default void doCook(){
        fire();
        oil();
        putVegetables();
        stirFry();
    }

    default void fire(){
        System.out.println("点火热锅");
    }

    default void oil(){
        System.out.println("放油");
    }

    void putVegetables();

    default void stirFry(){
        System.out.println("翻炒");
    }
}
