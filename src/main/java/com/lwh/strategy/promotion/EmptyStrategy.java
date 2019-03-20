package com.lwh.strategy.promotion;

public class EmptyStrategy implements PromotionStrategy{
    public void doPromotion() {
        System.out.println("抱歉，暂无优惠活动！");
    }
}
