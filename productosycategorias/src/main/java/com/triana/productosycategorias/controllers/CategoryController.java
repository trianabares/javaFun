package com.triana.productosycategorias.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.triana.productosycategorias.models.CategoryModel;
import com.triana.productosycategorias.services.MainService;

import jakarta.validation.Valid;

@Controller
public class CategoryController {

	// INYECCION DE DEPENDENCIAS
		private final MainService mainServ;
		public CategoryController(MainService service) {
			this.mainServ = service;
		}
		
		@GetMapping("/categories/new")
		public String formNuevaCategoria(@ModelAttribute("categoria") CategoryModel categoria) {
			return "nuevacategoria.jsp";
		}
		
		@PostMapping("/category/new")
		public String nuevaCategoria(@Valid @ModelAttribute("categoria") CategoryModel categoria, BindingResult resultado) {
			if(resultado.hasErrors()) {
				return "/categories/new";
			}
			mainServ.crearCategoria(categoria);
			return "redirect:/";
		}
}
