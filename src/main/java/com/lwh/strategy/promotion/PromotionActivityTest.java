package com.lwh.strategy.promotion;

import org.apache.commons.lang3.StringUtils;

public class PromotionActivityTest {
    public static void main(String[] args) {
        //实际场景一次只会有一个活动
        PromotionActivity couponActivity = new PromotionActivity(new CouponStrategy());
        PromotionActivity cashBackActivity = new PromotionActivity(new CashbackStrategy());

        couponActivity.execute();
        cashBackActivity.execute();
    }

   //需要if else判断活动的类型
//        public static void main(String[] args) {
//        PromotionActivity promotionActivity = null;
//
//        String promotionKey = "COUPON";
//
//        if(StringUtils.equals(promotionKey,"COUPON")){
//            promotionActivity = new PromotionActivity(new CouponStrategy());
//        }else if(StringUtils.equals(promotionKey,"CASHBACK")){
//            promotionActivity = new PromotionActivity(new CashbackStrategy());
//        }//......
//        promotionActivity.execute();
//    }


    //通过单例+工厂模式 消除if else
    /*public static void main(String[] args) {
        String promotionKey = "GROUPBUY";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.execute();
    }*/
}
