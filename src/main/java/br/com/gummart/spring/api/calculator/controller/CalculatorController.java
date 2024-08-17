package br.com.gummart.spring.api.calculator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculator")
public class CalculatorController {

    @GetMapping("/soma/{numeroUm}/{numeroDois}")
    public ResponseEntity<String> soma( @PathVariable(value = "numeroUm") double numeroUm,
                                        @PathVariable(value = "numeroDois") double numeroDois){
        double resultado = numeroUm + numeroDois;
        return ResponseEntity.ok().body(String.valueOf(resultado));
    }

}
