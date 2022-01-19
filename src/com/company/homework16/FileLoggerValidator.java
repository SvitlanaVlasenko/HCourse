package com.company.homework16;

import java.nio.file.Path;

public final class FileLoggerValidator {

    private FileLoggerValidator() {
    }

    public static void checkMaxSizeFile(long current, long max, Path file){
        if (current > max) {
            throw new FileMaxSizeReachedException(
                    String.format(
                            "File [{data}}] reached size [{level}}] bigger than [{information}}]",
                            file,
                            current,
                            max
                    )
            );

        }

    }

}
