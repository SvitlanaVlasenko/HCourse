package com.company.homework5.professions;

import com.company.homework5.vehicles.Car;

public class Driver extends Car {
    protected String name;
    protected String experience;

    public Driver(String brand, String classCar, String driver, String engine, int weight) {
        super("Nissan", "small", "Sveta", "low", 100);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", experience='" + experience + '\'' +
                ", brand='" + brand + '\'' +
                ", classCar='" + classCar + '\'' +
                ", driver='" + driver + '\'' +
                ", engine='" + engine + '\'' +
                ", weight=" + weight +
                '}';
    }
}
