package com.triana.licencias.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.triana.licencias.models.Licencia;
import com.triana.licencias.models.Persona;
import com.triana.licencias.services.MainService;

import jakarta.validation.Valid;

@Controller
public class MainController {
	
	
	// INYECCIO DEPENDENCIAS 
	@Autowired
	private MainService mainService;
	
	@GetMapping("/")
	public String root(Model viewModel) {
		List<Persona> todosUsuarios = mainService.todasPersonas();
		viewModel.addAttribute("todos", todosUsuarios);
		return "index.jsp";
	}
	
	@GetMapping("/persons/new")
	public String formularioPersona(@ModelAttribute("persona") Persona persona) {
		return "newperson.jsp";
	}
	
	@PostMapping("/persons/new")
	public String crearPersona(@Valid @ModelAttribute("persona") Persona persona, BindingResult resultado) {
		if(resultado.hasErrors()) {
			return "newperson.jsp";
		}
		mainService.crearPersona(persona);
		return "redirect:/";
	}
	
	@GetMapping("/licencias/new")
	public String formularioLicencia(@ModelAttribute("licencia") Licencia licencia, Model viewModel) {
	//	List <Persona> todosUsuarios = mainService.todasPersonas();
	//	viewModel.addAttribute("personas", todosUsuarios);
		viewModel.addAttribute("personas", mainService.obtenerPersonasSinLic());
		return "newlic.jsp";
	}
	
	@PostMapping("/licencias/new")
	public String crearLicencia(@Valid @ModelAttribute("licencia") Licencia licencia, BindingResult resultado) {
		if(resultado.hasErrors()) {
			return "newlic.jsp";
		}
		mainService.crearLicencia(licencia);
		return "redirect:/";
	}
	
	// MOSTAR INFO
    @GetMapping("/persons/{id}")
    public String mostrarinfo(@PathVariable("id") Long id, Persona persona, Model model) {
    	Persona person = mainService.findPerson(id);
    	model.addAttribute("persona", person);
        return "/showinfo.jsp";
    }
	
	
	
	 //ELIMINAR PERSONA
    @DeleteMapping("/persons/{id}")
    public String emilinar(@PathVariable("id") Long id) {
        mainService.eliminarPersona(id);
        return "redirect:/";
    }

}
