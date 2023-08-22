package com.triana.licencias.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.triana.licencias.models.Persona;

@Repository
public interface PersonaRepo extends CrudRepository <Persona, Long> {

	List<Persona> findAll();
	
	@Query(value="SELECT p.* FROM personas p LEFT OUTER JOIN licencias l ON p.id=l.persona_id WHERE l.id IS NULL", nativeQuery=true)
	List<Persona> encontrarNoLic();
	
	//List<Persona> findByLicenciaIdIsNull();
	
}
