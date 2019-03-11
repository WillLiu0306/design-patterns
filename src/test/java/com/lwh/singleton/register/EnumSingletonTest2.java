package com.lwh.singleton.register;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class EnumSingletonTest2 {
    public static void main(String[] args) {

        try {
            //序列化得到的仍是同一个对象
            EnumSingleton enumSingleton = EnumSingleton.getInstance();
            FileOutputStream fos = new FileOutputStream("singleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(enumSingleton);
            oos.flush();
            oos.close();
            fos.close();
            FileInputStream fis = new FileInputStream("singleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            EnumSingleton enumSingleton2 = (EnumSingleton) ois.readObject();
            ois.close();
            fis.close();

            System.out.println(enumSingleton == enumSingleton2);


            //枚举不支持反射
            //java.lang.IllegalArgumentException: Cannot reflectively create enum objects
	        //            at java.lang.reflect.Constructor.newInstance(Constructor.java:417)
            Class clazz = EnumSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(String.class,int.class);
            c.setAccessible(true);
            EnumSingleton enumSingleton3 = (EnumSingleton)c.newInstance("Tom",666);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
