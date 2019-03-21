package com.lwh.observer.guava;

import com.google.common.eventbus.EventBus;
import com.lwh.observer.gperadvice.Question;

public class GuavaGper {

    private String name="Gper生态圈";
    private EventBus eventBus;

    protected GuavaGper(EventBus eventBus){
        this.eventBus = eventBus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void publishQuestion(Question question){
        System.out.println(question.getUserName() + "在" + this.name + "上提交了一个问题。");
        eventBus.post(question);
    }
}
