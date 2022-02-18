package ua.HCourse.build.jar;
import java.nio.file.Path;

/**
 * 3. Создать класс FileLoggerConfiguration. Класс представляет конфигурацию для логирования.
 * Состоит из свойств: файл куда будет записываться информация,
 * текущий уровень логирования, максимальный размер файла (в байтах), формат для записи в файл.
 */

public class FileLoggerConfiguration {
    private final Path file;
    private final LoggingLevel level;
    private final long maxSizeofFile;
    private final String writeFormatLevel;

    public FileLoggerConfiguration(Path file, LoggingLevel level, long maxSizeofFile, String writeFormatLevel) {
        this.file = file;
        this.level = level;
        this.maxSizeofFile = maxSizeofFile;
        this.writeFormatLevel = writeFormatLevel;
    }

    public Path getFile() {
        return file;
    }

    public LoggingLevel getLevel() {
        return level;
    }

    public long getMaxSizeofFile() {
        return maxSizeofFile;
    }

    public String getWriteFormatLevel() {
        return writeFormatLevel;
    }
}