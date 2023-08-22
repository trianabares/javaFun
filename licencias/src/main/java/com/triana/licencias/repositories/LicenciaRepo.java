package com.triana.licencias.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.triana.licencias.models.Licencia;
import com.triana.licencias.models.Persona;

@Repository
public interface LicenciaRepo extends CrudRepository <Licencia, Long> {

	
}
