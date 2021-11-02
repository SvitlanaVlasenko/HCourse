package com.company.homework5.details;

import com.company.homework5.vehicles.Car;

public class Engine extends Car {
    protected String power;
    protected String company;

    public Engine(String brand, String classCar, String driver, String engine, int weight) {
        super("Nissan", "small", "Sveta", "low", 100);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power='" + power + '\'' +
                ", company='" + company + '\'' +
                ", brand='" + brand + '\'' +
                ", classCar='" + classCar + '\'' +
                ", driver='" + driver + '\'' +
                ", engine='" + engine + '\'' +
                ", weight=" + weight +
                '}';
    }
}
