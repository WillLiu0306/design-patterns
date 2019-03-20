package com.lwh.strategy.promotion;

public class CashbackStrategy implements PromotionStrategy{
    public void doPromotion() {
        System.out.println("有优惠活动了，返现金！");
    }
}
