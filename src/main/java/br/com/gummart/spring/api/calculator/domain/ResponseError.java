package br.com.gummart.spring.api.calculator.domain;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseError {

    private int status;
    private String data;
    private String erro;

}
