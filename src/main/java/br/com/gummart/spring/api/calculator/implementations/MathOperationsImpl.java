package br.com.gummart.spring.api.calculator.implementations;

import br.com.gummart.spring.api.calculator.interfaces.MathOperations;
import org.springframework.stereotype.Component;

@Component
public class MathOperationsImpl implements MathOperations {

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

    public final String raizQuadrada(double numero) {
        return String.valueOf(java.lang.Math.sqrt(numero));
    }

}
