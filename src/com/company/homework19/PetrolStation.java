package com.company.homework19;


import java.util.concurrent.Semaphore;

public class PetrolStation {
    public int amount;
    private final Semaphore semaphore = new Semaphore(3);

    public PetrolStation(int amount) {
        this.amount = amount;
    }

    public void comeIn(){
        try {
            semaphore.acquire();
        System.out.println("Thread:" +Thread.currentThread().getName() +"came in");
        ThreadSafeList.doSleep(3000, 10000);
        if (this.amount > amount){
            System.out.println("Thread:" +Thread.currentThread().getName() +"feel fuel");
        }else {
            System.out.println("Thread:" + Thread.currentThread().getName() + "not anouf fuel");
        }
        System.out.println("Thread:" +Thread.currentThread().getName() +"left in");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaphore.release();
        }
    }


}
