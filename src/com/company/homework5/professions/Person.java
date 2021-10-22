package com.company.homework5.professions;

public class Person extends Driver {

    protected String fullName;
    protected int age;

    public Person(String brand, String classCar, String driver, String engine, int weight) {
        super(brand, classCar, driver, engine, weight);
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", experience='" + experience + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", brand='" + brand + '\'' +
                ", classCar='" + classCar + '\'' +
                ", driver='" + driver + '\'' +
                ", engine='" + engine + '\'' +
                ", weight=" + weight +
                '}';
    }
}
