package br.com.gummart.spring.api.calculator.handler;

import br.com.gummart.spring.api.calculator.domain.ResponseError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;

@RestControllerAdvice
public class ControllerHandler {

    @ExceptionHandler(Exception.class)
    ResponseEntity<Object> handleException(final Exception ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ResponseError.builder()
                .status(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .data(new Date().toString())
                .erro("Ocorreu um erro interno no servidor verifique os logs!")
                .build());
    }

}
