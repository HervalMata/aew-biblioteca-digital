package com.aewinformatica.bibliotecadigital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AewBibliotecaDigitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(AewBibliotecaDigitalApplication.class, args);
	}
	
	@RequestMapping("/")
	public String Ola(){
		
		return "Ola tudo certo?";
	}
}
