package com.triana.productosycategorias.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.triana.productosycategorias.models.ProductCategoryModel;
import com.triana.productosycategorias.services.MainService;

@Controller
public class ProductCategoryController {
	
	// INYECCION DE DEPENDENCIAS
	private final MainService mainServ;
	public ProductCategoryController(MainService service) {
		this.mainServ = service;
	}
		
	@PostMapping("/aso/{id}")
	public String asociarProductoCategoria(@PathVariable("id") Long id, @ModelAttribute("asociacion") ProductCategoryModel productosCategorias, Model model, BindingResult resultado) {
		if(resultado.hasErrors()) {
			return "showproduct.jsp";
		}
		mainServ.crearAsociacion(productosCategorias);
		return "redirect:/products/"+id;
	}
	
	@PostMapping("/asoc/{id}")
	public String asociarCategoriaProducto(@PathVariable("id") Long id, @ModelAttribute("asociacion") ProductCategoryModel categoriaProductos, Model model, BindingResult resultado) {
		if(resultado.hasErrors()) {
			return "showcategory.jsp";
		}
		mainServ.crearAsociacion(categoriaProductos);
		return "redirect:/categories/"+id;
	}
	
}
