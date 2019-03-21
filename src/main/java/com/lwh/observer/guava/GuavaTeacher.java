package com.lwh.observer.guava;

import com.google.common.eventbus.Subscribe;
import com.lwh.observer.gperadvice.Question;

public class GuavaTeacher {
    private String name;

    public GuavaTeacher(String name) {
        this.name = name;
    }

    @Subscribe
    public void listen(Question question){
        System.out.println(name+"老师"+",您收到"+question.getUserName()
                +"的问题，内容是："+question.getContent());
    }
}
