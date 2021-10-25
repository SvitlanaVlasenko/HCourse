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
        System.out.print("People run ");
    }

    public void peoplejump() {
        System.out.print("People jump ");
    }
}
