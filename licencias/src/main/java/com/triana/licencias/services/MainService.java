package com.triana.licencias.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.triana.licencias.models.Licencia;
import com.triana.licencias.models.Persona;
import com.triana.licencias.repositories.LicenciaRepo;
import com.triana.licencias.repositories.PersonaRepo;

@Service
public class MainService {
	
	// INYECCION DEPENDENCIAS
	@Autowired
	private LicenciaRepo licenciaRepo;
	
	@Autowired
	private PersonaRepo personaRepo;
	
	// SERVICIOS PARA PERSONA
	public Persona crearPersona(Persona persona) {
		return personaRepo.save(persona);
	}
	
	public List<Persona> todasPersonas(){
		return personaRepo.findAll();
	}
	
	// SERVICIOS PARA LICENCIA 
	public Licencia crearLicencia(Licencia licencia) {
		return licenciaRepo.save(licencia);
	}

	public List<Persona> obtenerPersonasSinLic(){
		//return personaRepo.findByLicenciaIdIsNull();
		return personaRepo.encontrarNoLic();
	}
	
	// METODO PARA GENERAR NUMERO DE LICENCIA
	//public int genererNumeroLic() {
	//	
	//}
	
}
