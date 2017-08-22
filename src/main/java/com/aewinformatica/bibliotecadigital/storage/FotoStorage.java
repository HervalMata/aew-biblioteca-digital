package com.aewinformatica.bibliotecadigital.storage;

import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FotoStorage {
	
	public final String THUMBNAIL_PREFIX = "thumbnail.";
	public final String URL = "http://localhost:8080/fotos/";
	
	
	public String salvar(MultipartFile[] files);

	public byte[] recuperar(String foto);
	
	public byte[] recuperarThumbnail(String foto);
	
	public void excluir(String foto);

	public String getUrl(String foto);
	
	default String renomearArquivo(String nomeOriginal) {
		return UUID.randomUUID().toString() + "_" + nomeOriginal;
	}

}
