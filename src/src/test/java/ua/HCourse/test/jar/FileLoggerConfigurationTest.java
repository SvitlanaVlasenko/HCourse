package ua.HCourse.test.jar;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.nio.file.Path;

import ua.HCourse.build.jar.*;

public class FileLoggerConfigurationTest {
    FileLoggerConfiguration fileLoggerConfiguration;

    public FileLoggerConfigurationTest() {
        this.fileLoggerConfiguration = new FileLoggerConfiguration(Path.of(".", "logging.out"), LoggingLevel.INFO, 10000, "[{date}][{level}] Message:[{information}]");
    }

    @Test
    public void testFile() {
        Assertions.assertEquals(new File(".", "logging.out"), this.fileLoggerConfiguration.getFile());
    }

    @Test
    public void testLoggingLevel() {
        Assertions.assertEquals(LoggingLevel.INFO, this.fileLoggerConfiguration.getLevel());
    }

    @Test
    public void testMaxSizeofFile() {
        Assertions.assertEquals(10000, this.fileLoggerConfiguration.getMaxSizeofFile());
    }

    @Test
    public void testWriteFormatLevel() {
        Assertions.assertEquals("[{date}][{level}] Message:[{information}]", this.fileLoggerConfiguration.getWriteFormatLevel());
    }
}
