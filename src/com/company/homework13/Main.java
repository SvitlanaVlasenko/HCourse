package com.company.homework13;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileNavigator navigator = new FileNavigator();
        System.out.println("Size: " + navigator.find("/C:/HCourse/src/com/company/homework13").size());
    }

    static void doComparableDemo() {
        FileData filedata1 = new FileData("//C://HCourse//src//com//company//homework13", (byte) 1000000, "proxy");
        FileData filedata2 = new FileData("//C://HCourse//src//com//company//homework13", (byte) 1e+8, "server");

        System.out.println(filedata1.compareTo(filedata2));
    }

    static void demoWithNullCheck() {
        FileNavigator navigator = new FileNavigator();
        List<FileData> datas = navigator.find("/path/to/unknown/area");
        if (datas != null) {
            System.out.println("Size: " + datas.size());
        } else {
            System.out.println("Data is null");
        }
    }
}
