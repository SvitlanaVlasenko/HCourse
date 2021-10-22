package com.company.homework3;



import java.util.Arrays;

public class Person {
    public static void main(String[] args) {
/**2) Задан массив случаных чисел типа int в котором есть положительные и отрицательные числа.

 Написать метод который вернет массив квадратов этих чисел, отсортированных по возрастанию.*/
        System.out.println(getPersons());

        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }
        System.out.print("\nSorted numbers: \n");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(Math.pow(arr[i], 2) + "  ");
        }

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
}






