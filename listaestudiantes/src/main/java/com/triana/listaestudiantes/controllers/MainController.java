package com.triana.listaestudiantes.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.triana.listaestudiantes.models.Contactos;
import com.triana.listaestudiantes.models.Estudiantes;
import com.triana.listaestudiantes.services.MainService;

import jakarta.validation.Valid;

@Controller
public class MainController {

	// INYECCION DE DEPENDENCIAS
	private final MainService mainServ;
	public MainController(MainService serv) {
				this.mainServ = serv;
			}

	// MOSTRAR ESTUDIANTES 
	@GetMapping("/")
	public String root(Model model) {
		List<Estudiantes> todosEstudiantes = mainServ.todosEstudiantes();
		model.addAttribute("todos", todosEstudiantes);
		return "index.jsp";
	}
	
	// NUEVO ESTUDIANTE
	@GetMapping("/estudiantes/nuevo")
	public String formNuevoEstudiante(@ModelAttribute("estudiante") Estudiantes estudiante) {
		return "nuevoestudiante.jsp";
	}
	
	@PostMapping("/estudiantes/nuevo")
	public String nuevoEstudiante(@Valid @ModelAttribute("estudiante") Estudiantes estudiante, BindingResult resultado) {
		if(resultado.hasErrors()) {
			return "/estudiantes/nuevo";
		}
		mainServ.nuevoEstudiante(estudiante);
		return "redirect:/";
	}
	
	// NUEVO CONTACTO
	@GetMapping("/contactos/nuevo")
	public String formNuevoContacto(@ModelAttribute("contactos") Contactos contacto, Model modelo) {
		modelo.addAttribute("estudiantes", mainServ.obtenerEstudiantesSinContacto());
		return "nuevocontacto.jsp";
	}

	@PostMapping("/contactos/nuevo")
	public String nuevoContacto(@Valid @ModelAttribute("contactos") Contactos contacto, BindingResult resultado) {
		if (resultado.hasErrors()) {
			return "/contactos/nuevo";
		}
		mainServ.nuevoContacto(contacto);
		return "redirect:/";
	}

}
