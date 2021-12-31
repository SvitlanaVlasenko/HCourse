package com.company.homework19;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ThreadSafeList {
    private CopyOnWriteArrayList<Integer> sleep = new CopyOnWriteArrayList();

    public void add(int newSleep){
        sleep.add(newSleep);
    }
    public void remove(int index){
        sleep.remove(index);
    }
    public void get(int index){
        sleep.get(index);
    }
    static void doSleep(int a, int b) throws InterruptedException {
        Thread.sleep(ThreadLocalRandom.current().nextInt(a, b));
    }

}
