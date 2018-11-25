package org.ojasoft.iocv.services;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledCVInvokerService implements  IService{
    private static ScheduledExecutorService scheduledExecutorService;
    static  {
        scheduledExecutorService =  Executors.newScheduledThreadPool(1);
    }
     public static void invokeTaskIn(Runnable r,long period, TimeUnit timeUnit) {
         scheduledExecutorService.scheduleAtFixedRate(r,0,period, timeUnit);
     }
}
