package com.company.homework18;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class CountDownTime {
    public static void main(String[] args) {
        start(5l);
    }

    static void start(long l) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
        System.out.println("START");
        executorService.scheduleAtFixedRate(
                new Runnable() {
                    long second = l;
                    @Override
                    public void run() {
                        System.out.println(String.format("%02d:%02d:%02d",TimeUnit.SECONDS.toHours(second),
                                TimeUnit.SECONDS.toMinutes(second), TimeUnit.SECONDS.toSeconds(second)));
                        second--;
                        if(second==0){
                            System.out.println("THE END");
                        }
                    }
                },
                5L,
                1L,
                TimeUnit.SECONDS
        );
 //       executorService.shutdown();
    }


}
