package br.com.gummart.spring.api.calculator.controller;

import br.com.gummart.spring.api.calculator.service.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculator")
public class CalculatorController {

    private MathService service;

    @Autowired
    public CalculatorController(MathService mathService) {
        this.service = mathService;
    }

    @GetMapping("/soma/{numeroUm}/{numeroDois}")
    public ResponseEntity<String> soma( @PathVariable double numeroUm,
                                        @PathVariable double numeroDois){
        return ResponseEntity.ok().body(service.soma(numeroUm, numeroDois));
    }

    @GetMapping("/subtracao/{numeroUm}/{numeroDois}")
    public ResponseEntity<String> subtracao( @PathVariable double numeroUm,
                                             @PathVariable double numeroDois){
        return ResponseEntity.ok().body(service.subtracao(numeroUm, numeroDois));
    }

    @GetMapping("/multiplicacao/{numeroUm}/{numeroDois}")
    public ResponseEntity<String> multiplicacao( @PathVariable double numeroUm,
                                                 @PathVariable double numeroDois){
        return ResponseEntity.ok().body(service.multiplicacao(numeroUm, numeroDois));
    }

    @GetMapping("/divisao/{numeroUm}/{numeroDois}")
    public ResponseEntity<String> divisao( @PathVariable double numeroUm,
                                           @PathVariable double numeroDois){
        return ResponseEntity.ok().body(service.divisao(numeroUm, numeroDois));
    }

    @GetMapping("/media/{numeroUm}/{numeroDois}")
    public ResponseEntity<String> media( @PathVariable double numeroUm,
                                         @PathVariable double numeroDois){
        return ResponseEntity.ok().body(service.media(numeroUm, numeroDois));
    }

    @GetMapping("/raiz/{numero}")
    public ResponseEntity<String> raiz(@PathVariable double numero){
        return ResponseEntity.ok().body(service.raizQuadrada(numero));
    }

}
