package com.triana.productosycategorias.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.triana.productosycategorias.models.CategoryModel;

@Repository
public interface CategoryRepo extends CrudRepository<CategoryModel, Long> {

}
