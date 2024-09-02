package br.com.gummart.spring.api.calculator.service;

import br.com.gummart.spring.api.calculator.interfaces.MathOperations;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

    private final MathOperations operations;

    @Autowired
    public Service(MathOperations mathOperations) {
        this.operations = mathOperations;
    }

    public final String soma(double numeroUm, double numeroDois){
        return operations.soma(numeroUm,numeroDois);
    }

    public final String subtracao(double numeroUm, double numeroDois){
        return operations.subtracao(numeroUm,numeroDois);
    }

    public final String multiplicacao(double numeroUm, double numeroDois){
        return operations.multiplicacao(numeroUm,numeroDois);
    }

    public final String divisao(double numeroUm, double numeroDois){
        return operations.divisao(numeroUm,numeroDois);
    }

    public final String media(double numeroUm, double numeroDois){
        return operations.media(numeroUm,numeroDois);
    }

    public final String raizQuadrada(double numero){
        return operations.raizQuadrada(numero);
    }
}
