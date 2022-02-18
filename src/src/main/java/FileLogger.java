
import java.io.*;
import java.nio.file.Path;
import java.time.LocalDateTime;

public class FileLogger {

    public static void main(String[] args){
        FileLoggerConfiguration fileLoggerConfiguration = new FileLoggerConfiguration(
                Path.of(".", "logging.out"),
                LoggingLevel.INFO,
                10000,
                "[{date}][{level}] Message:[{information}]"
        );
        FileLogger fileLogger = new FileLogger(fileLoggerConfiguration);
        System.out.println("Hello!");

    }

    private final FileLoggerConfiguration configuration;
    private final FileLoggerWriter loggerWriter;

    /**
     * 1. Создать класс FileLogger. Класс будет осуществлять логирование (протоколирование) информации в указанный файл
     * на основании конфигурационного объекта.
     */
    public FileLogger(FileLoggerConfiguration configuration) {
        this.configuration = configuration;
        loggerWriter = new FileLoggerWriter(configuration);
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
        File file = configuration.getFile().toFile();
        FileLoggerValidator.checkMaxSizeFile(file.length() + information.length(),
                configuration.getMaxSizeofFile(),
                configuration.getFile());

        loggerWriter.write(file, information);


    }

    private void info(String information) throws IOException {
        File file = configuration.getFile().toFile();
        FileLoggerValidator.checkMaxSizeFile(file.length() + information.length(),
                configuration.getMaxSizeofFile(),
                configuration.getFile());

        loggerWriter.write(file, information);

    }


}
