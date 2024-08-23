package br.com.gummart.spring.api.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "br.com.gummart.spring.api.calculator")
public class SpringApiCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringApiCalculatorApplication.class, args);
	}

}
