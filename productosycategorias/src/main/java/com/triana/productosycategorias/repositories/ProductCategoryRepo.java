package com.triana.productosycategorias.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.triana.productosycategorias.models.ProductCategoryModel;

@Repository
public interface ProductCategoryRepo extends CrudRepository<ProductCategoryModel, Long> {

}
