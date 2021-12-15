package com.company.homework16;

import java.io.*;
import java.util.Date;

public class FileLogger {
    public static void main(String[]args) throws Exception {
        new FileLogger().doWrite();

    }

    private final File test;
    private final BufferedWriter writer;
    private final BufferedWriter reader;

    public FileLogger() {
        try {
            test = new File(".\test.txt");
            writer = new BufferedWriter(new FileWriter(test, true));
            reader = new BufferedReader(new InputStreamReader(System.in));
        } catch (IOException e){
            throw new RuntimeException("Something wrong with writer!", e);
        }
    }

    public void doWrite() throws Exception {
        writer.write("Session start...");
        while (true){
            String line = reader.readLine();
            if (line.equals("-end")){
                doFileWrite("Session closed!");
                System.out.println("Session closed!");
                break;
            }
            doFileWrite(line);
        }
    }

    private void doFileWrite(String line) throws Exception{
        try{
            writer.write(new Date().toString());
            writer.write(line);
            writer.newLine();
            writer.flush();
        } catch(IOException e){
            throw new RuntimeException("Something bad when write to file!" +test, e);
        }


    }
}
