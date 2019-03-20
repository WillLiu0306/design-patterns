package com.lwh.strategy.pay.PayPort;

import java.util.HashMap;
import java.util.Map;

public class PayStrategy {
    private static Map<String,Payment> strategyMap = new HashMap<String, Payment>();
    public static final String ALI_PAY = "AliPay";
    public static final String JD_PAY = "JdPay";
    public static final String WECHAT_PAY = "WechatPay";
    public static final String DEFAULT_PAY = ALI_PAY;
    static {
        strategyMap.put(ALI_PAY,new AliPay());
        strategyMap.put(WECHAT_PAY,new WechatPay());
        strategyMap.put(JD_PAY,new JDPay());
    }
    public static Payment get(String payKey){
        if(!strategyMap.containsKey(payKey)){
            return strategyMap.get(DEFAULT_PAY);
        }
        return strategyMap.get(payKey);
    }
}
