package com.aewinformatica.bibliotecadigital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LivrosController {
	
	@GetMapping("/livros")
	public String home(){
		
		return "CadastroLivros";
	}

}
