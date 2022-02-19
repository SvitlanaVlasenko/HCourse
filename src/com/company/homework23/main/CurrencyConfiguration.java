import com.company.homework23.CurrencyName;

import java.nio.file.Path;
import java.time.LocalDate;

public class CurrencyConfiguration {
    static Path path = Path.of("C:\\HCourse\\src\\com\\company\\homework23\\data");
    static CurrencyName currencynamesource;
    static CurrencyName currencynametarget;
    static LocalDate startdate;
    static LocalDate enddate;
    static String line;


    public CurrencyConfiguration(CurrencyName currencynamesource, CurrencyName currencynametarget, LocalDate startdate, LocalDate enddate, String line) {
        this.currencynamesource = currencynamesource;
        this.currencynametarget = currencynametarget;
        this.startdate = startdate;
        this.enddate = enddate;
        this.line = line;
    }

    public CurrencyConfiguration(com.company.homework23.CurrencyName uah, com.company.homework23.CurrencyName aud) {
    }


    public static Path getPath() {
        return path;
    }

    public static CurrencyName getCurrencynamesource() {
        return CurrencyConfiguration.currencynamesource;
    }

    public CurrencyName getCurrencynametarget() {
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

    @Override
    public String toString() {
        return "CurrencyConfiguration{" +
                "currencynamesource=" + currencynamesource +
                ", currencynametarget=" + currencynametarget +
                ", startdate=" + startdate +
                ", enddate=" + enddate +
                ", line='" + line + '\'' +
                '}';
    }
}
