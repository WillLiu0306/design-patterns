package com.lwh.strategy.promotion;

import java.util.HashMap;
import java.util.Map;

public class PromotionStrategyFactory {
    private static Map<String,PromotionStrategy> strategyMap = new HashMap<String, PromotionStrategy>();
    static {
        strategyMap.put(PromotionKey.CASHBACK.value, new CashbackStrategy());
        strategyMap.put(PromotionKey.COUPON.value, new CouponStrategy());
    }
    private static final PromotionStrategy emptyStrategy = new EmptyStrategy();

    public static PromotionStrategy getPromotionStrategy(String promotionKey){
        PromotionStrategy promotionStrategy = strategyMap.get(promotionKey);
        return promotionStrategy == null ? emptyStrategy : promotionStrategy;
    }

    private enum PromotionKey{
        CASHBACK("CASHBACK"),COUPON("COUPON");
        private String value;
        PromotionKey(String value){
            this.value = value;
        }
    }


}
