package com.lwh.template.course;

public class BigDataCourse extends NetworkCourse{

    private boolean needCheckHomework;

    public BigDataCourse(boolean needCheckHomework){
        this.needCheckHomework = needCheckHomework;
    }

    void checkHomework() {
        System.out.println("检查课后作业");
    }

    @Override
    boolean needCheckHomeWork() {
        return this.needCheckHomework;
    }
}
