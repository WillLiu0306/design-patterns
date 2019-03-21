package com.lwh.template.course;

import org.apache.tools.ant.taskdefs.Javac;

public class courseTest {
    public static void main(String[] args) {
        System.out.println("java------");
        JavaCourse javaCourse = new JavaCourse();
        javaCourse.createCourse();

        System.out.println("bigData -----");
        BigDataCourse bigDataCourse = new BigDataCourse(true);
        bigDataCourse.createCourse();
    }
}
