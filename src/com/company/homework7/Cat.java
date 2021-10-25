package com.company.homework7;

public class Cat implements Participant {
    @Override
    public void run() {
       catrun();
    }

    @Override
    public void jump() {
        catjump();
    }

    public void catrun() {
        System.out.print("Cat run ");
    }

    public void catjump() {
        System.out.print("Cat jump ");
    }
}
