package com.num3rd.java.scheduler;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorDemo implements Runnable {
    private String jobName = "";

    public ScheduledExecutorDemo(String jobName) {
        super();
        this.jobName = jobName;
    }

    public void run() {
        System.out.println("Execute " + jobName);
    }

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);

        long initialDelay1 = 1;
        long period1 = 1;
        scheduledExecutorService.scheduleAtFixedRate(new ScheduledExecutorDemo("job1"), initialDelay1, period1, TimeUnit.SECONDS);

        long initialDelay2 = 2;
        long period2 = 2;
        scheduledExecutorService.scheduleWithFixedDelay(new ScheduledExecutorDemo("job2"), initialDelay2, period2, TimeUnit.SECONDS);
    }
}
