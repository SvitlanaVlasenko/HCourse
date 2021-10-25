package com.company.homework3;


import java.util.Objects;

public class Person {
    public static void main(String[] args){
        System.out.println(getPersons());
    }
    /**
     * 1) Создать класс Person у котороего есть 3 поля - фамилия, имя, отчество.
     * Создать 2 конструктора - одни на все поля,
     * во второй задается строка типа "Иванов Иван Иванович",
     * он ее должен распарсить и задать значения полям.
     */
    protected String firstName;
    protected String secondName;
    protected String lastName;

    public Person(String firstName, String secondName, String lastName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static Person getPersons() {
        Person persons = new Person("Ivanov", "Ivan", "Ivanovich");
        persons.setFirstName("Ivanov");
        persons.setSecondName("Ivan");
        persons.setLastName("Ivanovich");
        return persons;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return firstName.equals(person.firstName) && secondName.equals(person.secondName) && lastName.equals(person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, lastName);
    }
}





