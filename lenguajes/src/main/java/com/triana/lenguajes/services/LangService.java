package com.triana.lenguajes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.triana.lenguajes.models.Language;
import com.triana.lenguajes.repositories.LangRepo;

@Service
public class LangService {

	@Autowired
	private LangRepo langRepo;

	public LangService(LangRepo langRepo) {
		this.langRepo = langRepo;
	}

	public List<Language> allLanguages() {
		return langRepo.findAll();
	}

	public Language addLang(Language lang) {
		return langRepo.save(lang);
	}

	public void eliminarLenguaje(Long id) {
		langRepo.deleteById(id);
	}

	public Language findLang(Long id) {
		Optional<Language> optionalLang = langRepo.findById(id);
		if (optionalLang.isPresent()) {
			return optionalLang.get();
		} else {
			return null;
		}

	}

	// actualizar los lenguajes - sobrecarga de metodos
	public Language actualizarLang(Language lang) {
		Language temporal = findLang(lang.getId());
		temporal.setName(lang.getName());
		temporal.setCreator(lang.getCreator());
		temporal.setVersion(lang.getVersion());
		langRepo.save(temporal);

		return langRepo.save(temporal);
	}

	public Language actualizarLang(Long id, String name, String creator, String version) {
		Language temporal = langRepo.findById(id).orElse(null);// si no encuentra, va a ser null
		if (temporal != null) {// si hay lbro, no sera null, por lo tanta se actualizara y retornara
			temporal.setName(name);
			temporal.setCreator(creator);
			temporal.setVersion(version);
			langRepo.save(temporal);

			return langRepo.save(temporal);
		} else {
			return temporal;
		}

	}
	
	// MOSTRAR
	
	public Language mostrar(Long id) {
		return langRepo.findById(id).orElse(null);
	}

}
