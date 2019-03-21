package com.lwh.observer.gperadvice;

public class GperAdviseTest {
    public static void main(String[] args) {
        Gper gper = Gper.getInstance();

        Teacher teacher = new Teacher("Tom");
        //先add 后 publish
        gper.addObserver(teacher);

        gper.publishQuestion(new Question("will","老师,怎么理解适配器？"));

    }
}
