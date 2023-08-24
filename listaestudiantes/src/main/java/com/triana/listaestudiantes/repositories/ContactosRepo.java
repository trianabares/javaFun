package com.triana.listaestudiantes.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.triana.listaestudiantes.models.Contactos;

@Repository
public interface ContactosRepo extends CrudRepository<Contactos, Long> {

}
