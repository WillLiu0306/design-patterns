package com.lwh.adapter.uploadadapter;

public class CloudController {

    CloudService cloudService;
    public CloudController(CloudService cloudService){
        this.cloudService = cloudService;
    }

    public void uploadFileToCloud(){
        cloudService.uploadFile("haha.zip");
    }

    public static void main(String[] args) {
        CloudController cloudController = new CloudController(new CloudService("ALISDK"));
        cloudController.uploadFileToCloud();
    }
}
