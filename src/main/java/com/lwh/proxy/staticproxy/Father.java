package com.lwh.proxy.staticproxy;

import com.lwh.proxy.Person;

public class Father implements Person {
    private Son son;
    public Father(Son son){
        this.son = son;
    }

    public void findLove() {
        System.out.println("我帮儿子物色合适的对象");
        son.findLove();
        System.out.println("双方同意，在一起吧");
    }
}
