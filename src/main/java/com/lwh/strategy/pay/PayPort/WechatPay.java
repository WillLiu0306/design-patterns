package com.lwh.strategy.pay.PayPort;

public class WechatPay extends Payment{
    public String getName() {
        return "微信";
    }

    public double queryBalance(String uid) {
        return 700;
    }
}
