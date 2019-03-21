package com.lwh.observer.guava;

import com.google.common.eventbus.EventBus;
import com.lwh.observer.gperadvice.Question;

public class Test {


    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        GuavaGper guavaGper = new GuavaGper(eventBus);
        GuavaTeacher teacher = new GuavaTeacher("Tom");
        eventBus.register(teacher);
        guavaGper.publishQuestion(new Question("will","hahha"));

    }

}
