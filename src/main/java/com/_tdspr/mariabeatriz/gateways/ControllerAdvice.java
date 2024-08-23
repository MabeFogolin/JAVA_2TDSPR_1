package com._tdspr.mariabeatriz.gateways;

import org.hibernate.PropertyValueException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler
    public ResponseEntity trataPropertyvalueException(PropertyValueException exception) {
        return ResponseEntity.badRequest().build();
    }
}
