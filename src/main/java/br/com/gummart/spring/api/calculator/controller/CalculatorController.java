package br.com.gummart.spring.api.calculator.controller;

import br.com.gummart.spring.api.calculator.domain.ResponseBody;
import br.com.gummart.spring.api.calculator.enums.OperacaoesMatematicasEnum;
import br.com.gummart.spring.api.calculator.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("calculator")
public class CalculatorController {

    private final Service service;

    @Autowired
    public CalculatorController(Service service) {
        this.service = service;
    }

    @GetMapping("/soma/{numeroUm}/{numeroDois}")
    public ResponseEntity<ResponseBody> soma( @PathVariable double numeroUm,
                                              @PathVariable double numeroDois){
        return ResponseEntity.ok().body(ResponseBody.builder()
                .operacao(OperacaoesMatematicasEnum.SOMA.getOperacao())
                .data(LocalDate.now())
                .resultado(service.soma(numeroUm, numeroDois))
                .build());
    }

    @GetMapping("/subtracao/{numeroUm}/{numeroDois}")
    public ResponseEntity<ResponseBody> subtracao( @PathVariable double numeroUm,
                                                   @PathVariable double numeroDois){
        return ResponseEntity.ok().body(ResponseBody.builder()
                .operacao(OperacaoesMatematicasEnum.SUBTRACAO.getOperacao())
                .data(LocalDate.now())
                .resultado(service.subtracao(numeroUm, numeroDois))
                .build());
    }

    @GetMapping("/multiplicacao/{numeroUm}/{numeroDois}")
    public ResponseEntity<ResponseBody> multiplicacao( @PathVariable double numeroUm,
                                                       @PathVariable double numeroDois){
        return ResponseEntity.ok().body(ResponseBody.builder()
                .operacao(OperacaoesMatematicasEnum.MULTIPLICACAO.getOperacao())
                .data(LocalDate.now())
                .resultado(service.multiplicacao(numeroUm, numeroDois))
                .build());
    }

    @GetMapping("/divisao/{numeroUm}/{numeroDois}")
    public ResponseEntity<ResponseBody> divisao( @PathVariable double numeroUm,
                                           @PathVariable double numeroDois){
        return ResponseEntity.ok().body(ResponseBody.builder()
                .operacao(OperacaoesMatematicasEnum.DIVISAO.getOperacao())
                .data(LocalDate.now())
                .resultado(service.divisao(numeroUm, numeroDois))
                .build());
    }

    @GetMapping("/media/{numeroUm}/{numeroDois}")
    public ResponseEntity<ResponseBody> media( @PathVariable double numeroUm,
                                         @PathVariable double numeroDois){
        return ResponseEntity.ok().body(ResponseBody.builder()
                .operacao(OperacaoesMatematicasEnum.MEDIA.getOperacao())
                .data(LocalDate.now())
                .resultado(service.media(numeroUm, numeroDois))
                .build());
    }

    @GetMapping("/raiz/{numero}")
    public ResponseEntity<ResponseBody> raiz(@PathVariable double numero) {
        return ResponseEntity.ok().body(ResponseBody.builder()
                .operacao(OperacaoesMatematicasEnum.RAIZ.getOperacao())
                .data(LocalDate.now())
                .resultado(service.raizQuadrada(numero))
                .build());
    }

}
