package com.triana.productosycategorias.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.triana.productosycategorias.models.CategoryModel;
import com.triana.productosycategorias.models.ProductCategoryModel;
import com.triana.productosycategorias.models.ProductModel;
import com.triana.productosycategorias.repositories.CategoryRepo;
import com.triana.productosycategorias.repositories.ProductCategoryRepo;
import com.triana.productosycategorias.repositories.ProductRepo;

@Service
public class MainService {
	
	// INYECCION DE LOS REPOSITORIOS
	private final ProductRepo productRepo;
	private final CategoryRepo categoryRepo;
	private final ProductCategoryRepo productCategoryRepo;
	public MainService(ProductRepo pRo, CategoryRepo cRe, ProductCategoryRepo pcRe) {
		this.productRepo = pRo;
		this.categoryRepo = cRe;
		this.productCategoryRepo = pcRe;
	}
	
	// Crear
	public ProductModel crearProducto(ProductModel producto) {
		return productRepo.save(producto);
	}
	
	public CategoryModel crearCategoria(CategoryModel categoria) {
		return categoryRepo.save(categoria);
	}
	
	public ProductCategoryModel crearAsociacion(ProductCategoryModel productoCategoria) {
		return productCategoryRepo.save(productoCategoria);
	}
	
	// metodo para mostrar
	public List<CategoryModel> produtoSinCategoria(ProductModel producto){
		return categoryRepo.findByProductsNotContains(producto);
	}
	
	public List<ProductModel> categoriasAProducto(CategoryModel categoria){
		return productRepo.findByCategoriesNotContains(categoria);
	}
	
	public ProductModel unProducto(Long id){
		return productRepo.findById(id).orElse(null);
	}
	
	public CategoryModel unaCategoria(Long id){
		return categoryRepo.findById(id).orElse(null);
	}

	public List<ProductModel> todosProductos(){
		return productRepo.findAll(); 
	}
	
	public List<CategoryModel> todasCategorias(){
		return categoryRepo.findAll(); 
	}
}
