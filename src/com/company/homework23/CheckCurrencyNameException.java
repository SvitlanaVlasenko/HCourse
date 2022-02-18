package com.company.homework23;

public class CheckCurrencyNameException extends RuntimeException {
    public CheckCurrencyNameException(String message) {
        super(message);
    }

    public CheckCurrencyNameException(String message, Throwable cause) {
        super(message, cause);
    }
}

