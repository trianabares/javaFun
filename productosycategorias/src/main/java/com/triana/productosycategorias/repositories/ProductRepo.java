package com.triana.productosycategorias.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.triana.productosycategorias.models.ProductModel;

@Repository
public interface ProductRepo extends CrudRepository<ProductModel, Long> {

	
}
