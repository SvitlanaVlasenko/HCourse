package com.company.homework7;

public class Robot implements Participant {
    @Override
    public void run() {
        robotrun();
    }
    @Override
    public void jump() {
        robotjump();
    }

    public void robotrun() {
        System.out.println("Robot run ");
    }

    public void robotjump() {
        System.out.println("Robot jump ");
    }


}
