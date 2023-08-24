package com.triana.listaestudiantes.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.triana.listaestudiantes.models.Estudiantes;

@Repository
public interface EstudiantesRepo extends CrudRepository<Estudiantes, Long> {
	
	List<Estudiantes> findAll();
	
	@Query(value="SELECT e.* FROM estudiantes e LEFT OUTER JOIN contactos c ON e.id=c.estudiante_id WHERE c.id IS NULL", nativeQuery=true)
	List<Estudiantes> estudiantesSinContacto();
}
