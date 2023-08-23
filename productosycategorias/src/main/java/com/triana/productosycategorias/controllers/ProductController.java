package com.triana.productosycategorias.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.triana.productosycategorias.models.ProductModel;
import com.triana.productosycategorias.services.MainService;

import jakarta.validation.Valid;

@Controller
public class ProductController {
	
	// INYECCION DE DEPENDENCIAS
	private final MainService mainServ;
	public ProductController(MainService service) {
		this.mainServ = service;
	}
	
	@GetMapping("/products/new")
	public String formNuevoProducto(@ModelAttribute("producto") ProductModel producto) {
		return "nuevoproducto.jsp";
	}
	
	@PostMapping("/products/new")
	public String nuevoProducto(@Valid @ModelAttribute("producto") ProductModel producto, BindingResult resultado) {
		if(resultado.hasErrors()) {
			return "/products/new";
		}
		mainServ.crearProducto(producto);
		return "redirect:/";
	}
	
}

