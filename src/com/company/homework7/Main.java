package com.company.homework7;

public class Main {
    public static void main(String[] args) {

        Participant[] participants = getParticipants();
        Barrier[] barriers = getBarriers();

        for (int j = 0; j < participants.length; j++) {
            for (int i = 0; i < barriers.length; i++) {
                barriers[i].overcome(participants[j]);
            }

        }

    }

    static Barrier[] getBarriers() {
        return new Barrier[]{
                new Wall(), new Treadmill()
        };
    }

    static Participant[] getParticipants() {
        return new Participant[]{
                new Cat(), new People(), new Robot()
        };

    }
}





