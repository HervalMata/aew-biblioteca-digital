package com.aewinformatica.bibliotecadigital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.servlet.ModelAndView;

import com.aewinformatica.bibliotecadigital.model.Livro;
import com.aewinformatica.bibliotecadigital.repository.Livros;
import com.aewinformatica.bibliotecadigital.service.CadastroLivroService;

@RestController
@RequestMapping("/livros")
public class LivrosController {
	
	@Autowired
	private Livros livros;
	
	@Autowired
	CadastroLivroService cadastroLivroService;
	
	
	@GetMapping
	public ModelAndView home(Livro livro){
		
		ModelAndView mv = new ModelAndView("CadastroLivros");
		
		List<Livro> listaLivros = livros.findAll();
		
		mv.addObject("livros",listaLivros);
		
		return mv;
	}
	
	@PostMapping
	public String salvar(Livro livro){
		
		cadastroLivroService.salvar(livro);
		return "redirect:/livros";
	}
	

}
