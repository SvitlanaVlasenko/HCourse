package com.company.homework7;

public abstract class Barrier extends Participant {

    @Override
    public void run() {
        overcome();
    }

    @Override
    public void jump() {
        overcome();
    }

    public abstract void overcome();
}
