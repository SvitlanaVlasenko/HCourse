public class FileMaxSizeReachedException extends RuntimeException {
    public FileMaxSizeReachedException(String information) {
        super(information);
    }

    public FileMaxSizeReachedException(String information, Throwable cause) {
        super(information, cause);
    }

}
