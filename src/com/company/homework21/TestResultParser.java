package com.company.homework21;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TestResultParser {
    public static List<String> parse(String fileName) throws IOException {
        File file = new File(fileName);
        return parse(file);
    }

    public static List<String> parse(File file) throws IOException {
        List<String> testResults = new ArrayList<>();

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            TestResult result = null;
            while ((line = bufferedReader.readLine()) != null) {
                testResults.add(line);
            }
            for (String str : testResults) {

                if (line.contains("tests found")) {
                    line = line.replaceAll("[a-zA-Z ]", "");
                    TestResult.setTotalNumberTest(LocalDateTime.parse(line.replaceAll("[a-zA-Z ]", "")));
                } else if (line.contains("tests successful")) {
                    line = line.replaceAll("[a-zA-Z ]", "");
                    TestResult.setPassedNumberTest(LocalDateTime.parse(line.replaceAll("[a-zA-Z ]", "").substring(1, line.length() - 1)));
                } else if (line.contains("tests failed")) {
                    line = line.replaceAll("[a-zA-Z ]", "");
                    TestResult.setFailedNumberTest(LocalDateTime.parse(line.replaceAll("[a-zA-Z ]", "").substring(1, line.length() - 1)));
                }

            }
        return testResults;
    }

    public static List<String> parse(Path path) throws IOException {
        return parse(path.toFile());
    }
}
