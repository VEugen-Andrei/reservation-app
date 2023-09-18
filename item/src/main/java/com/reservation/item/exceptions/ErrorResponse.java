package com.reservation.item.exceptions;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ErrorResponse {
    public static final String CLIENT_ERROR_CODE = "007";

    private String errorMessage;
    private String errorCode;

}
