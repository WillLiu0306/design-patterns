package com.lwh.template.noabstract;

public class NoAbstractTest {
    public static void main(String[] args) {
        Cook cookBroccoli = new CookBroccoli();
        cookBroccoli.doCook();

        System.out.println("-----");
        Cook cookCarrot = new CookCarrot();
        cookCarrot.doCook();
    }
}
