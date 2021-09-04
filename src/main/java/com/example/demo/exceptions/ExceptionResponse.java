package com.example.demo.exceptions;

import java.time.LocalDate;

@Getter
@Generated
@AllArgsConstructor
public class ExceptionResponse {
    private LocalDate timeStamp;
    private String message;
    private String details;
    private String type;
}