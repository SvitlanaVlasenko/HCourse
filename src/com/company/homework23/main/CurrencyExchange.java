
import com.company.homework23.CurrencyName;

import java.io.*;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Semaphore;


import static java.lang.String.valueOf;
import static java.lang.System.*;

public class CurrencyExchange {
    public static void main(String[] args) {
        List<CurrencyConfiguration> configurationList = new ArrayList<>(
                List.of(
                        new CurrencyConfiguration(CurrencyName.UAH, CurrencyName.USD),
                        new CurrencyConfiguration(CurrencyName.UAH, CurrencyName.AUD)
                )
        );

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        Scanner sc = new Scanner(in);
        System.out.println("Enter currency code:");
        String currencynamesource = sc.nextLine();
        System.out.println("Enter start date in range between 13.01.2022 to 16.01.2022:");
        LocalDate startdate = LocalDate.parse(sc.nextLine(), formatter);
        System.out.println("Enter end date in range between 14.01.2022 to 17.01.2022:");
        LocalDate enddate = LocalDate.parse(sc.nextLine(), formatter);

        do {
            if ((currencynamesource.contains(CurrencyName.USD) || currencynamesource.contains(CurrencyName.AUD)) && (enddate.compareTo(startdate) > 0)) {
                Semaphore semaphore = new Semaphore(2);
                try {
                    semaphore.acquire();

                    new Thread(getRate(configurationList, currencynamesource, enddate, startdate, CurrencyConfiguration.line, CurrencyConfiguration.path)).start();
                    getFileInfo(configurationList, currencynamesource, startdate, enddate, CurrencyConfiguration.line, CurrencyConfiguration.path);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release();
                }
                break;
            } else {
                throw new com.company.homework23.CheckCurrencyNameException("Please enter currency again USD or AUD");
            }
        } while (true);
    }

    static Runnable getRate(List<CurrencyConfiguration> configurationList, String currencynamesource, LocalDate startdate, LocalDate enddate, String line, Path path) {
        return new Runnable() {
            @Override
            public void run() {

                getFileInfo(configurationList, currencynamesource, startdate, enddate, line, path);
            }
        };
    }

    public static double countMiddle(List<Double> rateDate) {
        double result = 0;

        for (int i = 0; i < rateDate.size(); i++) {
            result += rateDate.get(0);
        }

        return result / rateDate.size();
    }

    private static double getFileInfo(List<CurrencyConfiguration> configurationList, String currencynamesource, LocalDate startdate, LocalDate enddate, String line, Path path) {
        String allNames = null;
        List<Double> rateDate = new ArrayList<>();
        List<String> inform = new ArrayList<>();
        File dir = new File(valueOf(path));
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                BufferedReader inputStream = null;
                String currency = null;
                try {
                    inputStream = new BufferedReader(new FileReader(file));

                    while ((line = inputStream.readLine()) != null) {
                        inform.add(line);
                    }

                } catch (IOException e) {
                    out.println(e);
                } finally {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }

                }

            }


            rateDate.add(Double.parseDouble(inform.get(Integer.parseInt(currencynamesource))));
            startdate = startdate.plusDays(1);
        }
        String allName = valueOf("[|]".split(inform.get(Integer.parseInt(currencynamesource))));
        return countMiddle(rateDate);

        //System.out.println("UAH [UAH] to %s [%s] %f", currencynamesource, allName, valueOf(countMiddle(rateDate)));
    }

}




