package br.com.gummart.spring.api.calculator.domain;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Error {
    private String erro;
    private String valor;
}
