package com.company.homework20;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;


public class TestRunner {
    private static final int BEFORE_SUITE = 0;
    private static final int AFTER_SUITE = 11;

    public static void start(Class testClass) throws IOException, RuntimeException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Object testObject;
        Constructor constructor = testClass.getConstructor();
        testObject = constructor.newInstance();
        Map<Integer, List<Method>> methodMap = new HashMap<>();
        for (Method method : testClass.getDeclaredMethods()) {
            if (method.getAnnotation(BeforeSuite.class) != null) {
                if (method.getParameterTypes().length > 0) {
                }
                List<Method> beforeSuite = methodMap.get(BEFORE_SUITE);

                if (beforeSuite != null) {
                }
                beforeSuite = new ArrayList<>(1);
                beforeSuite.add(method);
                methodMap.put(BEFORE_SUITE, beforeSuite);
            }

            if (method.getAnnotation(AfterSuite.class) != null) {
                if (method.getParameterTypes().length > 0) {
                }

                List<Method> afterSuite = methodMap.get(AFTER_SUITE);

                if (afterSuite != null) {
                }
                afterSuite = new ArrayList<>(1);
                afterSuite.add(method);
                methodMap.put(AFTER_SUITE, afterSuite);
            }


            if (method.getAnnotation(Test.class) != null) {
                if (method.getParameterTypes().length > 0) {
                }

                int prior = method.getAnnotation(Test.class).value();

                if (prior <= BEFORE_SUITE || prior >= AFTER_SUITE) {

                }

                List<Method> methodsByPrior = methodMap.getOrDefault(prior, new ArrayList<>());
                methodsByPrior.add(method);
                methodMap.put(prior, methodsByPrior);

            }
        }

        for (Map.Entry<Integer, List<Method>> entry : methodMap.entrySet()) {
            for (Method method : entry.getValue()) {

                int modifiers = method.getModifiers();

                if (Modifier.isPrivate(modifiers)) {
                    method.setAccessible(true);
                }

                if (Modifier.isStatic(modifiers)) {
                    method.invoke(null);
                } else {
                    method.invoke(testObject);
                }
            }
        }

    }

}







