package com.company.homework23;

import java.nio.file.Path;
import java.time.LocalDate;

public class CurrencyConfiguration {
    static Path path = Path.of("C:\\HCourse\\src\\com\\company\\homework23\\data");
    final CurrencyType currencynamesource;
    final CurrencyType currencynametarget;
    private final LocalDate startdate;
    private final LocalDate enddate;
    private final String line;

    public CurrencyConfiguration(CurrencyType currencynamesource,
                                 CurrencyType currencynametarget,
                                 LocalDate startdate,
                                 LocalDate enddate,
                                 String line) {
        this.currencynamesource = currencynamesource;
        this.currencynametarget = currencynametarget;
        this.startdate = startdate;
        this.enddate = enddate;
        this.line = line;
    }

    public static Path getPath() {
        return path;
    }

    public CurrencyType getCurrencynamesource() {
        return currencynamesource;
    }

    public CurrencyType getCurrencynametarget() {
        return currencynametarget;
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

    @java.lang.Override
    public java.lang.String toString() {
        return "CurrencyConfiguration{" +
                "currencynamesource=" + currencynamesource +
                ", currencynametarget=" + currencynametarget +
                ", startdate=" + startdate +
                ", enddate=" + enddate +
                ", line='" + line + '\'' +
                '}';
    }
}
