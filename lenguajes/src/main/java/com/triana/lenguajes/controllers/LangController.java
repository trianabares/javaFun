package com.triana.lenguajes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.triana.lenguajes.models.Language;
import com.triana.lenguajes.services.LangService;

import jakarta.validation.Valid;

@Controller
public class LangController {

	@Autowired
	LangService langService;
	
	@GetMapping("/")
	public String index(String artist, Model model) {
		List<Language> lang = langService.allLanguages();
		model.addAttribute("lang", lang);
		return "index.jsp";
	}
	
	@GetMapping("/add")
	public String addLang(@ModelAttribute("nuevolenguaje") Language lang) {
		return "index.jsp";
	}
	
	@PostMapping("/add")
	public String addLang(@Valid @ModelAttribute("nuevolenguaje") Language lang, BindingResult result) {
		if(result.hasErrors()) {
			return "index.jsp";
		}else {
			langService.addLang(lang);
			return "redirect:/";
		}
	}
	
}
