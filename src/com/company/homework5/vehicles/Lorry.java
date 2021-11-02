package com.company.homework5.vehicles;

public class Lorry extends Car {
    protected int carrying;

    public Lorry(String brand, String classCar, String driver, String engine, int weight, int carrying) {
        super(brand, classCar, driver, engine, weight);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "brand='" + brand + '\'' +
                ", classCar='" + classCar + '\'' +
                ", driver='" + driver + '\'' +
                ", engine='" + engine + '\'' +
                ", weight=" + weight +
                ", carrying=" + carrying +
                '}';
    }
}
