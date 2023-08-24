package com.triana.listaestudiantes.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.triana.listaestudiantes.models.Contactos;
import com.triana.listaestudiantes.models.Estudiantes;
import com.triana.listaestudiantes.repositories.ContactosRepo;
import com.triana.listaestudiantes.repositories.EstudiantesRepo;

@Service
public class MainService {

	// INYECCION DE LOS REPOSITORIOS
	private final EstudiantesRepo estudiantesRepo;
	private final ContactosRepo contactosRepo;

	public MainService(EstudiantesRepo eRo, ContactosRepo cRe) {
		this.estudiantesRepo = eRo;
		this.contactosRepo = cRe;
	}
	
	// MOSTRAR TODAS LOS ESTUDIANTES EN EL INDEX
	public List<Estudiantes> todosEstudiantes() {
		return estudiantesRepo.findAll();
	}

	// CREAR ESTUDIANTE NUEVO
	public Estudiantes nuevoEstudiante(Estudiantes estudiante) {
		return estudiantesRepo.save(estudiante);
	}

	// CREAR NUEVO CONTACTO
	public Contactos nuevoContacto(Contactos contacto) {
		return contactosRepo.save(contacto);
	}
	
	// ENONTRAR ESTUDIANTE SIN CONTACTO
	public List<Estudiantes> obtenerEstudiantesSinContacto() {
		return estudiantesRepo.estudiantesSinContacto();
	}

}
