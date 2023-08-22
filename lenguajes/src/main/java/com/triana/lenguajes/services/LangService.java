package com.triana.lenguajes.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.triana.lenguajes.models.Language;
import com.triana.lenguajes.repositories.LangRepo;

@Service
public class LangService {
	
	private final LangRepo langRepo;
	
	public LangService(LangRepo langRepo) {
		this.langRepo = langRepo;
	}
	
	public List<Language> allLanguages(){
		return langRepo.findAll();
	}
	
	public Language addLang(Language lang){
		return langRepo.save(lang);
	}

}