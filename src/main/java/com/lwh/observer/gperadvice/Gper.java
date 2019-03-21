package com.lwh.observer.gperadvice;

import java.util.Observable;

public class Gper extends Observable {
    private String name="Gper生态圈";
    private static Gper gper = null;

    private Gper(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Gper getInstance(){
        if (gper == null){
            gper = new Gper();
        }
        return gper;

    }

    public void publishQuestion(Question question){
        System.out.println(question.getUserName() + "在" + this.name + "上提交了一个问题。");
        setChanged();//需要先setChanged 再notify
        notifyObservers(question);

    }
}
