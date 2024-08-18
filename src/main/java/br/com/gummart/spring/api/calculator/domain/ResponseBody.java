package br.com.gummart.spring.api.calculator.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class ResponseBody {

    private String operacao;
    private LocalDate data;
    private String resultado;

}
