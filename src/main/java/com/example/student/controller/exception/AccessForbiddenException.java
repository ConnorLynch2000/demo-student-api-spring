package com.example.student.controller.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN, reason = "Authentication failed.")
public class AccessForbiddenException extends RuntimeException{
}
