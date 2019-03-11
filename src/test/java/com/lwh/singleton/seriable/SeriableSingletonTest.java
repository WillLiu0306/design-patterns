package com.lwh.singleton.seriable;

import java.io.*;

public class SeriableSingletonTest {
/*
    public static void main(String[] args) {
        SeriableSingleton seriableSingleton = SeriableSingleton.getInstance();
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("singleton.obj");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(seriableSingleton);


            FileInputStream fileInputStream = new FileInputStream("singleton.obj");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            SeriableSingleton seriableSingleton1 = (SeriableSingleton)objectInputStream.readObject();
            System.out.println(seriableSingleton == seriableSingleton1);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
*/

    public static void main(String []args){

        try {
            SeriableSingleton seriable = SeriableSingleton.getInstance();
            FileOutputStream fos = new FileOutputStream("singleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(seriable);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("singleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);


            SeriableSingleton seriable2 = (SeriableSingleton)ois.readObject();
            ois.close();
            System.out.println(seriable == seriable2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
