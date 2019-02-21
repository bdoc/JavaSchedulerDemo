package com.num3rd.java.scheduler;

import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo extends TimerTask {
    private String jobName = "";

    public TimerDemo(String jobName) {
        super();
        this.jobName = jobName;
    }

    public void run() {
        System.out.println("Execute " + jobName);
    }

    public static void main(String[] args) {
        Timer timer = new Timer();

        long delay1 = 1 * 1000;
        long period1 = 1000;
        timer.schedule(new TimerDemo("job1"), delay1, period1);

        long delay2 = 2 * 1000;
        long period2 = 2000;
        timer.schedule(new TimerDemo("job2"), delay2, period2);
    }
}
