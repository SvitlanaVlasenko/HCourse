package com.company.homework20;

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import static com.company.homework20.TestRunner.start;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Annotations result:");
        start(Tests.class);
    }

//    public static void start(Class<Tests> testsClass) throws Exception {
//        Class<String> stringClass = String.class;
//
//        Test annotationTest = stringClass.getDeclaredAnnotation(Test.class);
//        Field valueField = stringClass.getDeclaredField("value");
//        valueField.setAccessible(true);
//        String newValue = (String) valueField.get(stringClass);
//
//        Charset charset = Charset.defaultCharset();
//        if (annotationTest.value().equals("UTF-8")){
//            charset = StandardCharsets.UTF_8;
//
//        }else if (annotationTest.value().equals("UTF-16")){
//            charset = StandardCharsets.UTF_16;
//        }else if (annotationTest.value().equals("US_ASCII")){
//            charset = StandardCharsets.US_ASCII;
//        }
//        valueField.set(stringClass, new String(newValue.getBytes(charset)));
//        valueField.setAccessible(false);
//        annotationTest.value();
//        System.out.println("Annotation test" + annotationTest);
//
//    }
}


