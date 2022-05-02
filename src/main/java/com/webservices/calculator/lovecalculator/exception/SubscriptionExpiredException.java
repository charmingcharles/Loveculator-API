package com.webservices.calculator.lovecalculator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class SubscriptionExpiredException extends RuntimeException {

    public SubscriptionExpiredException() {
        super("Your subscription expired!");
    }
}
