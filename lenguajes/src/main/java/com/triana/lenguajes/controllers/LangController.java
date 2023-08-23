package com.triana.lenguajes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.triana.lenguajes.models.Language;
import com.triana.lenguajes.services.LangService;

import jakarta.validation.Valid;

@Controller
public class LangController {

	@Autowired
	LangService langService;

	@GetMapping("/languages")
	public String index(@ModelAttribute("nuevolenguaje") Language lang, Model model) {
		List<Language> language = langService.allLanguages();
		model.addAttribute("lang", language);
		return "index.jsp";
	}

	@PostMapping("/languages")
	public String addLang(@Valid @ModelAttribute("nuevolenguaje") Language lang, BindingResult result) {
		if (result.hasErrors()) {
			return "index.jsp";
		} else {
			langService.addLang(lang);
			return "redirect:/languages";
		}
	}

	// ELIMINAR
	@DeleteMapping("/languages/{id}")
	public String eliminarLenguaje(@PathVariable("id") Long id) {
		langService.eliminarLenguaje(id);
		return "redirect:/languages";
	}

	// EDITAR

	@GetMapping("/languages/{id}/edit")
	public String edit(@PathVariable("id") Long id, Model model) {
		Language lang = langService.findLang(id);
		model.addAttribute("language", lang);
		return "edit.jsp";
	}

	@PutMapping("/languages/{id}")
	public String update(@Valid @ModelAttribute("language") Language lang, BindingResult result) {
		if (result.hasErrors()) {
			return "edit.jsp";
		} else {
			langService.actualizarLang(lang);
			return "redirect:/languages";
		}
	}
	
	// MOSTAR
	
	@GetMapping("/languages/{id}")
	public String mostrar(@PathVariable("id") Long id, Model model) {
		Language lenguajes = langService.mostrar(id);
		model.addAttribute("language", lenguajes);
		return "showlang.jsp";
	}

}
