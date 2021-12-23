package com.company.homework20;

import org.testng.TestRunner;

public class Tests {

    @BeforeSuite
    public void methodBefore(TestRunner.PriorityWeight priority) {
        System.out.println("Method Before!");
    }


    @AfterSuite
    public void methodAfter(TestRunner.PriorityWeight priority) {
        System.out.println("Method After");
    }

    @Test(priority = 1)
    public void methodTest1() {
        System.out.println("Method priority 1!");
    }

    @Test(priority = 5)
    public void methodTest2() {
        System.out.println("Method priority 5!");
    }

    @Test(priority = 2)
    public void methodTest3() {
        System.out.println("Method priority 2!");
    }
}
