package com.lwh.prototype;

import java.io.*;

public class MonkeyKing implements Cloneable,Serializable{
    private String name;
    private int age;
    private GoldenCudgel goldenCudgel;

    /**
     * 浅拷贝
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    public Object deepClone() throws CloneNotSupportedException, IOException, ClassNotFoundException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(baos);
        objectOutputStream.writeObject(this);
        objectOutputStream.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(bais);

        Object object = objectInputStream.readObject();
        objectInputStream.close();
        return object;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public GoldenCudgel getGoldenCudgel() {
        return goldenCudgel;
    }

    public void setGoldenCudgel(GoldenCudgel goldenCudgel) {
        this.goldenCudgel = goldenCudgel;
    }
}
