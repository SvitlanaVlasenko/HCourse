package com.company.homework19;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args){
        PetrolStation petrol = new PetrolStation(5);
        new Thread(getPetrolRunner(petrol)).start();
        new Thread(getPetrolRunner(petrol)).start();
        new Thread(getPetrolRunner(petrol)).start();
        new Thread(getPetrolRunner(petrol)).start();
        new Thread(getPetrolRunner(petrol)).start();

    }



    static Runnable getPetrolRunner(PetrolStation petrol){
        return new Runnable() {
            @Override
            public void run() {
                petrol.comeIn();
            }
        };
    }
}
