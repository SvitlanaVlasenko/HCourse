package com.company.homework7;

public class People implements Participant {

    @Override
    public void run() {
        peoplerun();
    }
    @Override
    public void jump() {
        peoplejump();
    }
    public void peoplerun() {
        System.out.println("People run ");
    }

    public void peoplejump() {
        System.out.println("People jump ");
    }
}
