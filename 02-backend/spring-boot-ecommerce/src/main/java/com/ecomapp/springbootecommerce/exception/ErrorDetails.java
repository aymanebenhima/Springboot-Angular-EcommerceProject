package com.ecomapp.springbootecommerce.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@RequiredArgsConstructor
public class ErrorDetails {
    private final Date timestamp;
    private final String message;
    private final String details;
}
