package com.aewinformatica.bibliotecadigital.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.aewinformatica.bibliotecadigital.model.Livro;

public interface Livros extends JpaRepository<Livro,Long> {
	
//	List<Livro>finByDescricaoContaining(String descricao);

}
