package com.company.homework7;

public abstract class Participant {

    public void print() {
        System.out.print("Participant ");
        run();
        jump();

    }

    public abstract void run();
    public abstract void jump();
}

