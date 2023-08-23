package com.triana.productosycategorias.services;

import org.springframework.stereotype.Service;

import com.triana.productosycategorias.models.CategoryModel;
import com.triana.productosycategorias.models.ProductModel;
import com.triana.productosycategorias.repositories.CategoryRepo;
import com.triana.productosycategorias.repositories.ProductRepo;

@Service
public class MainService {
	
	// INYECCION DE LOS REPOSITORIOS
	private final ProductRepo productRepo;
	private final CategoryRepo categoryRepo;
	public MainService(ProductRepo pRo, CategoryRepo cRe) {
		this.productRepo = pRo;
		this.categoryRepo = cRe;
	}
	
	// Crear
	public ProductModel crearProducto(ProductModel producto) {
		return productRepo.save(producto);
	}
	
	public CategoryModel crearCategoria(CategoryModel categoria) {
		return categoryRepo.save(categoria);
	}
}
