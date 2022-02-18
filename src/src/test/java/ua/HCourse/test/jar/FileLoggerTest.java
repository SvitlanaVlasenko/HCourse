package ua.HCourse.test.jar;

import org.junit.jupiter.api.Test;
import ua.HCourse.build.jar.FileLogger;


public class FileLoggerTest {
    FileLogger fileLogger;

    public FileLoggerTest(FileLogger fileLogger) {
        this.fileLogger = fileLogger;
    }

    @Test
    public void testInfo(){
        fileLogger = new FileLogger(FileLoggerConfiguration.);

    }
}
