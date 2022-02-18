package com.company.homework20;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import static com.company.homework20.TestRunner.start;

public class Main {

    public static void main(String[] args) throws RuntimeException, IOException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        System.out.println("Annotations result:");
        start(Tests.class);
    }
}


