package com.triana.contador.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
	
	// Metodos de clase
	private void setContadorSession(HttpSession sesion, int numeroVeces) {
		sesion.setAttribute("contador", numeroVeces);		
	}
	
	private int getContadorSession(HttpSession sesion) {
		Object valorSesion = sesion.getAttribute("contador");
		if(valorSesion == null) {
			setContadorSession(sesion, 0);
			valorSesion = sesion.getAttribute("contador");
		}
		return (Integer) valorSesion;
	}
	
	
	// Metodos de ruta
	
	@GetMapping("/")
	public String index(HttpSession sesion) {
		int conteo = getContadorSession(sesion);
		setContadorSession(sesion, conteo+1);
		
		return "index.jsp";
	}
	
	@GetMapping("/counter")
	public String contador(HttpSession sesion, Model model) {
		model.addAttribute("contador", getContadorSession(sesion));
		return "counter.jsp";
	}
	
	@GetMapping("/reset")
	public String reset(HttpSession sesion) {
		sesion.invalidate();
		return "redirect:/counter";
	}
	
	@GetMapping("/doble")
	public String doble(HttpSession sesion) {
		int conteo = getContadorSession(sesion);
		setContadorSession(sesion, conteo+2);
		
		return "doble.jsp";
	}

}
