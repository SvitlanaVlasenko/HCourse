package com.company.homework7;

public class Wall extends Barrier {

    @Override
    public void overcome() {
        wall();
    }

    public void wall() {
        System.out.print("wall");
    }
}
