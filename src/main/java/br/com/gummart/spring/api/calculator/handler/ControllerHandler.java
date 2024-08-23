package br.com.gummart.spring.api.calculator.handler;

import br.com.gummart.spring.api.calculator.domain.ResponseError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

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

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    ResponseEntity<Object> handleException(final MethodArgumentTypeMismatchException ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ResponseError.builder()
                .status(HttpStatus.BAD_REQUEST.value())
                .data(new Date().toString())
                .erro("O parâmetro de calculo deve ser um número, parâmetro com erro: " + ex.getValue())
                .build());
    }

}
