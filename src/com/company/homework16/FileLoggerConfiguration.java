package com.company.homework16;

import java.io.File;

/**3. Создать класс FileLoggerConfiguration. Класс представляет конфигурацию для логирования.
        Состоит из свойств: файл куда будет записываться информация,
 текущий уровень логирования, максимальный размер файла (в байтах), формат для записи в файл.*/

public class FileLoggerConfiguration {
    private File file;
    private LoggingLevel level;
    private byte maxSizeofFile = 100;
    private final String writeFormatLevel = "[%s][%s] Message:[%s]";

    public FileLoggerConfiguration(File file, LoggingLevel level, byte maxSizeofFile) {
        this.file = file;
        this.level = level;
        this.maxSizeofFile = maxSizeofFile;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public LoggingLevel getLevel() {
        return level;
    }

    public void setLevel(LoggingLevel level) {
        this.level = level;
    }

    public byte getMaxSizeofFile() {
        return maxSizeofFile;
    }

    public void setMaxSizeofFile(byte maxSizeofFile) {
        this.maxSizeofFile = maxSizeofFile;
    }

    public String getWriteFormatLevel() {
        return writeFormatLevel;
    }
}
