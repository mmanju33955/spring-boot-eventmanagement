package com.Event.eventmanagment.exception;

import org.springframework.web.bind.annotation.ResponseStatus;


public class InvalidNameException extends RuntimeException {
    public InvalidNameException(String message) {
        super(message);
    }
}