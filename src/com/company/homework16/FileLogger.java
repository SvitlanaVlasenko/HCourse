package com.company.homework16;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Date;

public class FileLogger {
    public static void main(String[] args) throws Exception {

    }

    private File test;
    private BufferedWriter writer;
    private BufferedReader reader;
    private FileLoggerConfiguration configur;

    /**
     * 1. Создать класс FileLogger. Класс будет осуществлять логирование (протоколирование) информации в указанный файл
     * на основании конфигурационного объекта.
     *
     * @param configur
     */
    public FileLogger(FileLoggerConfiguration configur) {
        this.configur = configur;
        try {
            test = new File(".\test.txt");
            writer = new BufferedWriter(new FileWriter(test, true));
            reader = new BufferedReader(new InputStreamReader(System.in));
        } catch (IOException e) {
            throw new RuntimeException("Something wrong with writer!", e);
        }
    }


    /**
     * 3. В классе FileLogger. Создать методы debug и info, которые в качестве параметра принимают строку-сообщение.
     * Метод должны выполнять запись в указанный в конфигурации файл в установленном формате для записи из конфигурации.
     * Формат записи: [ТЕКУЩЕЕ_ВРЕМЯ][DEBUG] Сообщение: [СТРОКА-СООБЩЕНИЕ]
     * 4. При выполнении методов debug и info учесть максимально допустимый размер файла куда будут записываться логи.
     * При достижении максимального размера файла или его превышении,
     * выбросить исключение FileMaxSizeReachedException с сообщением информации максимального и текущего размера файла, пути к файлу.
     */
    private void debug(String information) throws IOException {
        if (configur.getLevel() == LoggingLevel.DEBUG) {
            fileMaxSizeReachedException();
            writer = new BufferedWriter(writer);
        }
        writer.write(String.format(configur.getWriteFormatLevel(),
                LocalDateTime.now(),
                configur.getLevel(),
                information)
        );
        writer.newLine();
        writer.flush();

    }

    private void inform(String information) throws IOException {
        if (configur.getLevel() == LoggingLevel.DEBUG) {
            return;
        }
        fileMaxSizeReachedException();
        writer = new BufferedWriter(writer);

        writer.write(String.format(configur.getWriteFormatLevel(),
                LocalDateTime.now(),
                configur.getLevel(),
                information)
        );
        writer.newLine();
        writer.flush();
    }

    private void fileMaxSizeReachedException() throws IOException {
        if (test.getFile().length() > test.getMaxSizeofFile()) {
            System.out.println("Size of file is big!" + test.getFile().length + test.getMaxSizeofFile);
        }
    }


}
