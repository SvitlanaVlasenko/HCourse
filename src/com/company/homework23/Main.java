package com.company.homework23;


import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static com.company.homework23.CurrencyConfiguration.*;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args, String currency) throws IOException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        Scanner sc = new Scanner(in);
        out.println("Enter currency code:");
        String curentcurrency = sc.nextLine();
        out.println("Enter start date in range between 13.01.2022 to 16.01.2022:");
        LocalDate startdate = LocalDate.parse(sc.nextLine(), formatter);
        out.println("Enter end date in range between 14.01.2022 to 17.01.2022:");
        LocalDate enddate = LocalDate.parse(sc.nextLine(), formatter);
        do {
            if ((curentcurrency != currency) && enddate.compareTo(startdate) > 0 ){
                throw new CheckCurrencyNameException("Please enter currency again UAH or AUD");
            } else
                getFileInfo();
        }


    }
        static void getFileInfo() throws IOException {
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
                            inputStream.close();
                        }
                    }

                }

            }
        }

}

