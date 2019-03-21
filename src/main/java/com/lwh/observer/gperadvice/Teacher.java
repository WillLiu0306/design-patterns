package com.lwh.observer.gperadvice;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Gper gper = (Gper) o;
        Question question = (Question)arg;
        System.out.println(name+"老师，您收到来自"+gper.getName()+question.getUserName()
                +"的提问，内容是："+question.getContent());

    }
}
