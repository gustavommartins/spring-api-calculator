package br.com.gummart.spring.api.calculator.interfaces;

public interface MathOperations {

    String soma(double numeroUm, double numeroDois);

    String subtracao(double numeroUm, double numeroDois);

    String multiplicacao(double numeroUm, double numeroDois);

    String divisao(double numeroUm, double numeroDois);

    String media(double numeroUm, double numeroDois);

    String raizQuadrada(double numero);

}
