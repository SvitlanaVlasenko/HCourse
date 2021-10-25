package com.company.homework7;

public class Treadmill implements Barrier {
    @Override
    public void overcome(Participant participant) {
        participant.run();
        treadmill();

    }

    public void treadmill() {
        System.out.println("treadmill");
    }


}
