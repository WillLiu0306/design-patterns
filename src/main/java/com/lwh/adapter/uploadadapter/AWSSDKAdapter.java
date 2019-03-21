package com.lwh.adapter.uploadadapter;

public class AWSSDKAdapter implements CloudSDK{
    private AWSSDK awssdk;

    public AWSSDKAdapter(AWSSDK awssdk) {
        this.awssdk = awssdk;
    }

    @Override
    public void putObject(String fileName) {
        awssdk.putObject(fileName);
    }
}
