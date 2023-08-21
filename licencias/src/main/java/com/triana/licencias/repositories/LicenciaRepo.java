package com.triana.licencias.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.triana.licencias.models.Licencia;

@Repository
public interface LicenciaRepo extends CrudRepository <Licencia, Long> {

}
