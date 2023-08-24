package com.triana.productosycategorias.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.triana.productosycategorias.services.MainService;

@Controller
public class MainController {
	
	// INYECCION DE DEPENDENCIAS
		private final MainService mainServ;
		public MainController(MainService service) {
			this.mainServ = service;
		}

	@GetMapping("/")
	public String root(Model model) {
		model.addAttribute("productos", mainServ.todosProductos());
		model.addAttribute("categorias", mainServ.todasCategorias());
		return "index.jsp";
	}
}
