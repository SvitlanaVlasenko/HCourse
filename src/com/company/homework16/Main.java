package com.company.homework16;

import java.nio.file.Path;

public class Main {
    public static void main(String[] args){
        FileLoggerConfiguration fileLoggerConfiguration = new FileLoggerConfiguration(
                Path.of(".", "logging.out"),
                LoggingLevel.INFO,
                10000,
                "[{date}][{level}] Message:[{information}]"
        );
        FileLogger fileLogger = new FileLogger(fileLoggerConfiguration);
        System.out.println("Hello!");

    }
}
