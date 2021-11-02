package com.company.homework7;

public class Wall implements Barrier {
    @Override
    public void overcome(Participant participant) {
        participant.jump();
        wall();
    }

    public void wall() {
        System.out.print("wall");
    }

}
