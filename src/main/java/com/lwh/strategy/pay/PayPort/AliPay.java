package com.lwh.strategy.pay.PayPort;

public class AliPay extends Payment{
    public String getName() {
        return "支付宝";
    }

    public double queryBalance(String uid) {
        return 500;
    }
}
