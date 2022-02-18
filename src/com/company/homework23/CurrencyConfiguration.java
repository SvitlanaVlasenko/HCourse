package com.company.homework23;

import java.nio.file.Path;
import java.time.LocalDate;

public class CurrencyConfiguration {
    static Path path = Path.of("C:\\HCourse\\src\\com\\company\\homework23\\data");
    private final CurrencyName currencyname;
    private final LocalDate startdate;
    private final LocalDate enddate;
    private final String line;

    public CurrencyConfiguration(CurrencyName currencyname, LocalDate startdate, LocalDate enddate, String line) {
        this.currencyname = currencyname;
        this.startdate = startdate;
        this.enddate = enddate;
        this.line = line;
    }

    public static Path getPath() {
        return path;
    }

    public CurrencyName getCurrencyname() {
        return currencyname;
    }

    public LocalDate getStartdate() {
        return startdate;
    }

    public LocalDate getEnddate() {
        return enddate;
    }

    public String getLine() {
        return line;
    }
}
