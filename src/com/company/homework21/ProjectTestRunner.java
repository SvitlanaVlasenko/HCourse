package com.company.homework21;

import java.io.FileNotFoundException;

public class ProjectTestRunner {
    public static void main(String[] args) throws FileNotFoundException {
        new TestRunner().run("homework21.SimpleMathLibraryTest");
        new TestRunner().run(SimpleMathLibrary.class);
        new TestRunner().run("com.company.homework21");

    }
}