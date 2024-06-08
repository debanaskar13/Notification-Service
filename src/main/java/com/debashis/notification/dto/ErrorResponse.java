package com.debashis.notification.dto;

import lombok.Data;

@Data
public class ErrorResponse {
    private int statusCode;
    private String message;
}
