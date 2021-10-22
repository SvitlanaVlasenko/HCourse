package com.company.homework5.vehicles;

public class SportCar extends Car {
    protected double speed;


    public SportCar(String brand, String classCar, String driver, String engine, int weight) {
        super(brand, classCar, driver, engine, weight);
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "brand='" + brand + '\'' +
                ", classCar='" + classCar + '\'' +
                ", driver='" + driver + '\'' +
                ", engine='" + engine + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                '}';
    }
}
