package com.aewinformatica.bibliotecadigital.service;

import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aewinformatica.bibliotecadigital.model.Livro;
import com.aewinformatica.bibliotecadigital.repository.Livros;
import com.aewinformatica.bibliotecadigital.service.exception.ImpossivelExcluirEntidadeException;
import com.aewinformatica.bibliotecadigital.storage.FotoStorage;

@Service
public class CadastroLivroService {

	@Autowired
	Livros livros;

	@Autowired
	private FotoStorage fotoStorage;

	@Transactional
	public void salvar(Livro livro) {

		livros.save(livro);
	}

	@Transactional
	public void excluir(Livro livro) {
		try {
			String foto = livro.getFoto();
			livros.delete(livro);
			livros.flush();
			fotoStorage.excluir(foto);
		} catch (PersistenceException e) {
			throw new ImpossivelExcluirEntidadeException("Impossível apagar livro. Já foi usado em alguma venda.");
		}
	}

}
