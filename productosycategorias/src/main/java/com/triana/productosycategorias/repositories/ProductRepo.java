package com.triana.productosycategorias.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.triana.productosycategorias.models.CategoryModel;
import com.triana.productosycategorias.models.ProductModel;

@Repository
public interface ProductRepo extends CrudRepository<ProductModel, Long> {

	List<ProductModel> findByCategoriesNotContains(CategoryModel categoria);

	List<ProductModel> findAll();

}
