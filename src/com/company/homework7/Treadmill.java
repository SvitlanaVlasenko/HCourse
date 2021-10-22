package com.company.homework7;

public class Treadmill extends Barrier {

    @Override
    public void overcome() {
        treadmill();
    }
    public void treadmill() {
        System.out.print("treadmill");
    }
}
