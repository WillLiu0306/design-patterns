package com.lwh.adapter.uploadadapter;

import java.util.HashMap;
import java.util.Map;

public class CloudFactory {
    static Map<String,CloudSDK> sdkMap = new HashMap<>();
    static {
        sdkMap.put("ALISDK",new AliSDKAdapter(new AliSDK()));
        sdkMap.put("AWSSDK",new AWSSDKAdapter(new AWSSDK()));
    }

    public static CloudSDK create(String cloudStrategy){
        return sdkMap.get(cloudStrategy);
    }
}
