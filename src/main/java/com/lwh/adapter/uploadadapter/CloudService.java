package com.lwh.adapter.uploadadapter;

public class CloudService {

    private CloudSDK cloudSDK;
    public CloudService(String cloudStrategy){
        this.cloudSDK = CloudFactory.create(cloudStrategy);
    }


    public void uploadFile(String fileName){
        cloudSDK.putObject(fileName);
    }
}
