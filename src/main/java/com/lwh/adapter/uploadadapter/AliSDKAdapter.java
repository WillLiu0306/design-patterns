package com.lwh.adapter.uploadadapter;

public class AliSDKAdapter implements CloudSDK{
    private AliSDK aliSDK;

    public AliSDKAdapter(AliSDK aliSDK) {
        this.aliSDK = aliSDK;
    }

    @Override
    public void putObject(String fileName) {
        aliSDK.setBucket();
        aliSDK.uploadFile(fileName);
    }
}
