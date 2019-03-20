package com.lwh.strategy.pay.PayPort;

public class JDPay extends Payment{
    public String getName() {
        return "京东支付";
    }

    public double queryBalance(String uid) {
        return 400;
    }
}
