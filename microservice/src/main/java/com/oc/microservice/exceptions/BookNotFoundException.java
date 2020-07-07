package com.oc.microservice.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BookNotFoundException extends RuntimeException {
    Logger logger = LoggerFactory.getLogger(BookNotFoundException.class);
    public BookNotFoundException(String s) {
        super(s);
        logger.warn("Message BookNotFoundException : "+super.getMessage());
    }
}
