package com.lwh.template.course;

public abstract class NetworkCourse {

    protected final void createCourse(){
        this.postPreResource();
        this.createPPT();
        this.liveVideo();
        this.postNote();
        this.postSource();
        if (needCheckHomeWork()){
            this.checkHomework();
        }
    }

    abstract void checkHomework();

    boolean needCheckHomeWork(){return false;}

    final void postSource(){ System.out.println("提交源代码"); }
    final void postNote(){ System.out.println("提交课件和笔记"); }
    final void liveVideo(){ System.out.println("直播授课"); }
    final void createPPT(){ System.out.println("创建备课 PPT"); }
    final void postPreResource(){ System.out.println("分发预习资料"); }

}
