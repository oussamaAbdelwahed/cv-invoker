package org.ojasoft.iocv.tasks;

import org.ojasoft.iocv.helpers.HttpClientHelper;

import java.io.IOException;

public class InvokeCVWebsite implements  ITask, Runnable{
    private String targetURL;

    public  InvokeCVWebsite() {}
    public InvokeCVWebsite(String url) {
        this.targetURL = url;
    }

    public String getTargetURL() {
        return targetURL;
    }

    public void setTargetURL(String targetURL) {
        this.targetURL = targetURL;
    }

    public void run() {
        try {
            HttpClientHelper.doGetRequest(this.targetURL);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

}
