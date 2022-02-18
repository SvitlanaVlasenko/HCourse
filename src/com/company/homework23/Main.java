
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Semaphore;


import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        List<com.company.homework23.CurrencyConfiguration> configurationList = new ArrayList<>(
                List.of(
                        new com.company.homework23.CurrencyConfiguration(CurrencyType.UAH, CurrencyType.AUD),
                        new com.company.homework23.CurrencyConfiguration(CurrencyType.UAH, CurrencyType.USD)
                )
        );

        getFileInfo(configurationList);
    }

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    Scanner sc = new Scanner(in);
    System.out.println("Enter currency code:");
    String currencynamesource = sc.nextLine();
    System.out.println("Enter start date in range between 13.01.2022 to 16.01.2022:");
    LocalDate startdate = LocalDate.parse(sc.nextLine(), formatter);
    System.out.println("Enter end date in range between 14.01.2022 to 17.01.2022:");
    LocalDate enddate = LocalDate.parse(sc.nextLine(), formatter);

    do{
        if ((currencynamesource.contains(CurrencyType)) && enddate.compareTo(startdate) > 0) {
            Semaphore semaphore = new Semaphore(2);
            try {
                semaphore.acquire();
                new Thread(getRate()).start();
                getFileInfo(configurationList);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
            }
            break;
        } else {
            throw new CheckCurrencyNameException("Please enter currency again USD or AUD");
        }while (true) ;
    }

    static Runnable getRate() {
        return new Runnable() {
            @Override
            public void run() {
                getFileInfo(configurationList);
            }
        };
    }

    static void getFileInfo(List<com.company.homework23.CurrencyConfiguration> configurationList) {
        File dir = new File(String.valueOf(path));
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                BufferedReader inputStream = null;
                String line;
                String currency = null;
                try {
                    inputStream = new BufferedReader(new FileReader(file));
                    while ((line = inputStream.readLine()) != null) {
                        System.out.println(line);
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

        }
    }

}


