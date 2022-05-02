package com.webservices.calculator.lovecalculator.exception;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExceptionResponse {

    private Date timestamp;
    private String message;
    private List<String> details;

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public List<String> getDetail() {
        return details;
    }

    public ExceptionResponse(Date timestamp, String message, List<String> detail) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = detail;
    }

    public ExceptionResponse(Date timestamp, String message, String detail) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = new ArrayList<>();
        details.add(detail);
    }
}

