package com.company.homework5.vehicles;

public class Car {
    protected String brand;
    protected String classCar;
    protected String driver;
    protected String engine;
    protected int weight;

    public Car(String brand, String classCar, String driver, String engine, int weight) {
        this.brand = brand;
        this.classCar = classCar;
        this.driver = driver;
        this.engine = engine;
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public String getClassCar() {
        return classCar;
    }

    public String getDriver() {
        return driver;
    }

    public String getEngine() {
        return engine;
    }

    public int getWeight() {
        return weight;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setClassCar(String classCar) {
        this.classCar = classCar;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void start(){
        System.out.println("Drive");
    }
    public void stop(){
        System.out.println("Stop");
    }
    public void turnLeft(){
        System.out.println("Turn left");
    }
    public void turnRight(){
        System.out.println("Turn right");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", classCar='" + classCar + '\'' +
                ", driver='" + driver + '\'' +
                ", engine='" + engine + '\'' +
                ", weight=" + weight +
                '}';
    }
}
