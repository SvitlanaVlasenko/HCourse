package com.company.homework20;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;


import static org.testng.TestRunner.PriorityWeight.priority;

public class TestRunner {

    public static void start(Class<Tests> testsClass) throws Exception {

        final int MIN_PRIORITY = 1;
        final int MAX_PRIORITY = 10;
        Class<Tests> testClass = Tests.class;


        Method methodBefore = testsClass.getDeclaredMethod("methodBefore", org.testng.TestRunner.PriorityWeight.class);
        if (methodBefore.isAnnotationPresent(Test.class)) {
            Tests testsAnno = (Tests) methodBefore.getDeclaredAnnotation(Test.class);
            testsAnno.methodBefore(priority);
            methodBefore.equals(MIN_PRIORITY);
        }
        Method methodAfter = testsClass.getDeclaredMethod("methodAfter", org.testng.TestRunner.PriorityWeight.class);
        if (methodAfter.isAnnotationPresent(Test.class)) {
            Tests testsAnnoAfter = (Tests) methodBefore.getDeclaredAnnotation(Test.class);
            testsAnnoAfter.methodAfter(priority);
            methodAfter.equals(MAX_PRIORITY);
        }
        Method methodTest1 = testsClass.getDeclaredMethod("methodTest1");
        if (methodTest1.isAnnotationPresent((Class<? extends Annotation>) Tests.class)) {
            Tests testsAnno1 = (Tests) methodTest1.getDeclaredAnnotation(Test.class);
            testsAnno1.methodBefore(priority);
        }
        Method methodTest2 = testsClass.getDeclaredMethod("methodTest2");
        if (methodTest1.isAnnotationPresent((Class<? extends Annotation>) Tests.class)) {
            Tests testsAnno2 = (Tests) methodTest2.getDeclaredAnnotation(Test.class);
            testsAnno2.methodBefore(priority);
        }
        Method methodTest3 = testsClass.getDeclaredMethod("methodTest3");
        if (methodTest1.isAnnotationPresent((Class<? extends Annotation>) Tests.class)) {
            Tests testsAnno3 = (Tests) methodTest3.getDeclaredAnnotation(Test.class);
            testsAnno3.methodBefore(priority);
        }
    }
}







