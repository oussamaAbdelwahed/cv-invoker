package org.ojasoft.iocv;


import org.ojasoft.iocv.services.ScheduledCVInvokerService;
import org.ojasoft.iocv.tasks.InvokeCVWebsite;

import java.sql.Time;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static  void main(String [] args) {
         Runnable task = new InvokeCVWebsite("https://oussama-abdelwahed-cv.herokuapp.com");
         ScheduledCVInvokerService.invokeTaskIn(task,24, TimeUnit.MINUTES);
    }
}
