package br.com.gummart.spring.api.calculator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MathService {

    @Autowired
    public MathService() {
    }

    public final String soma(double numeroUm, double numeroDois){
        return String.valueOf(numeroUm + numeroDois);
    }

    public final String subtracao(double numeroUm, double numeroDois){
        return String.valueOf(numeroUm - numeroDois);
    }

    public final String multiplicacao(double numeroUm, double numeroDois){
        return String.valueOf(numeroUm * numeroDois);
    }

    public final String divisao(double numeroUm, double numeroDois){
        return String.valueOf(numeroUm / numeroDois);
    }

    public final String media(double numeroUm, double numeroDois){
        return String.valueOf((numeroUm + numeroDois) / 2);
    }

    public final String raizQuadrada(double numero){
        return String.valueOf(Math.sqrt(numero));
    }
}
