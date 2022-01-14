package com.company.homework21;

import java.time.LocalDateTime;

public class TestResult {
    private LocalDateTime totalNumberTest;
    private LocalDateTime passedNumberTest;
    private LocalDateTime failedNumberTest;
    private LocalDateTime dateTest;

    public LocalDateTime getTotalNumberTest() {
        return totalNumberTest;
    }

    public static void setTotalNumberTest(LocalDateTime totalNumberTest) {
        totalNumberTest = totalNumberTest;
    }

    public LocalDateTime getPassedNumberTest() {
        return passedNumberTest;
    }

    public static void setPassedNumberTest(LocalDateTime passedNumberTest) {
        passedNumberTest = passedNumberTest;
    }

    public LocalDateTime getFailedNumberTest() {
        return failedNumberTest;
    }

    public static void setFailedNumberTest(LocalDateTime failedNumberTest) {
        failedNumberTest = failedNumberTest;
    }

    public LocalDateTime getDateTest() {
        return dateTest;
    }

    public void setDateTest(LocalDateTime dateTest) {
        this.dateTest = dateTest;
    }

    @Override
    public String toString() {
        return "TestResult{" +
                "totalNumberTest=" + totalNumberTest +
                ", passedNumberTest=" + passedNumberTest +
                ", failedNumberTest=" + failedNumberTest +
                ", dateTest=" + dateTest +
                '}';
    }
}
