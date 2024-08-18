package br.com.gummart.spring.api.calculator.enums;

import lombok.Getter;

@Getter
public enum OperacaoesMatematicasEnum {

    SOMA("Soma"),
    SUBTRACAO("Subtração"),
    DIVISAO("Divisão"),
    MULTIPLICACAO("Multiplicação"),
    MEDIA("Média"),
    RAIZ("Raiz Quadrada");


    private String operacao;

    OperacaoesMatematicasEnum(String operacao) {
        this.operacao = operacao;
    }

}
