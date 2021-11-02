package com.company.homework3;


public class Person {
    /**
     * 1) Создать класс Person у котороего есть 3 поля - фамилия, имя, отчество.
     * Создать 2 конструктора - одни на все поля,
     * во второй задается строка типа "Иванов Иван Иванович",
     * он ее должен распарсить и задать значения полям.
     */
    private String firstName;
    private String secondName;
    private String lastName;

    public Person(String firstName, String secondName, String lastName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public Person(String allName) {
        String delimeter = " ";
        String[] newAllName = allName.split(delimeter);
        firstName = newAllName[0];
        secondName = newAllName[1];
        lastName = newAllName[2];
    }

    public Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}





