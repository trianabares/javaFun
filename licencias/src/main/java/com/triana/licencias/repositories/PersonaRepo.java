package com.triana.licencias.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.triana.licencias.models.Persona;

@Repository
public interface PersonaRepo extends CrudRepository <Persona, Long> {

}
