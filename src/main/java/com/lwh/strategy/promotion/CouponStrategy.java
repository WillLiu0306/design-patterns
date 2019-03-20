package com.lwh.strategy.promotion;

public class CouponStrategy implements PromotionStrategy{
    public void doPromotion() {
        System.out.println("有优惠活动了，优惠券立减100！");
    }
}
