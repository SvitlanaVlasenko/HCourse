import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Date;

public class FileLoggerWriter {


    private final FileLoggerConfigurationFormatter formatter;

    public FileLoggerWriter(FileLoggerConfiguration configuration) {
        formatter = new FileLoggerConfigurationFormatter(configuration.getWriteFormatLevel());
    }

    public void write(Path file, String information){
        write(file.toFile(), information);
    }

    public void write(File file, String information){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(formatter.format(new Date(), LoggingLevel.DEBUG, information));
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException("File read operation!", e);
        }

    }
}
