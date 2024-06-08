package com.debashis.notification.exception;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmployeesException extends RuntimeException {

    private String message;

    EmployeesException(String message) {
        super(message);
        this.message = message;
    }

}
