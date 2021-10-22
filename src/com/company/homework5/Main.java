package com.company.homework5;

import com.company.homework5.professions.Person;
import com.company.homework5.vehicles.Car;
import com.company.homework5.vehicles.Lorry;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Nissan", "small", "Sveta", "low", 100);
        car1.setBrand("Nissan");
        car1.setClassCar("small");
        car1.setDriver("Sveta");
        car1.setEngine("low");
        car1.setWeight(100);
        car1.start();
        car1.turnLeft();
        car1.turnRight();
        car1.stop();
        System.out.println(car1);

        Lorry lorry1 = new Lorry("JH","big","Anton","low", 200,23);
        lorry1.setBrand("JH");
        lorry1.setClassCar("big");
        lorry1.setDriver("Anton");
        lorry1.setEngine("low");
        lorry1.setWeight(200);
        lorry1.setCarrying(23);


        Person person1 =new Person("WV", "small", "Dima", "low", 30);
        person1.setAge(22);
        person1.setFullName("Dima Kot");
        person1.setBrand("WV");
        person1.setDriver("Dima");
        person1.setEngine("low");
        person1.setWeight(30);
        person1.setName("Kot");
        person1.setExperience("big");
        person1.setClassCar("small");
        person1.start();
        person1.turnLeft();
        person1.turnRight();
        person1.stop();
        System.out.println(person1);


    }
}
