package com.lwh.adapter.power;

public class PowerAdapter implements DC5{
    private AC220 ac220;

    public PowerAdapter(AC220 ac220){
        this.ac220 = ac220;
    }


    @Override
    public int outputDC5() {
        int output220 = ac220.outputAC220V();
        int outPut5 = output220/44;
        System.out.println("220v转成"+outPut5+"V输出了");
        return outPut5;
    }
}
