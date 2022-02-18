import java.util.Date;

public class FileLoggerConfigurationFormatter {
    private static final String DATE_FLAG = "{date}";
    private static final String LEVEL_FLAG = "{level}";
    private static final String INFORMATION_FLAG = "{information}";

    private final String format;

    public FileLoggerConfigurationFormatter(String format) {
        this.format = format;
    }

    public String format(Date date, LoggingLevel level, String information) {
        return format
                .replace(DATE_FLAG, date.toString())
                .replace(LEVEL_FLAG, level.name())
                .replace(INFORMATION_FLAG, information);
    }
}
