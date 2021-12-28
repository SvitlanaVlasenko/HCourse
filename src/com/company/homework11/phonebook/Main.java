package com.company.homework11.phonebook;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook();
        phonebook.add("sveta", "123");

        System.out.print("Find name in phonebook:");
        System.out.println(phonebook.find("sveta"));
    }
}
