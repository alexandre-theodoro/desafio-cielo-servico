package com.extrato.conta.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.extrato"})
public class ExtratoDeLancamentosEmConta1Application {

	public static void main(String[] args) {
		SpringApplication.run(ExtratoDeLancamentosEmConta1Application.class, args);
	}
}
