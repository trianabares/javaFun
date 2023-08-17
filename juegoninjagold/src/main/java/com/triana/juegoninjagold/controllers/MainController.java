package com.triana.juegoninjagold.controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String irRaiz() {
		return "redirect:/gold";
	}

	@GetMapping("/gold")
	public String raiz(HttpSession sesion, Model model) {
		model.addAttribute("gold", sesion.getAttribute("gold"));
		model.addAttribute("resultados", sesion.getAttribute("resultados"));
		return "index.jsp";
	}
	
	
	@PostMapping("/gold")
	public String enviarOro(HttpSession sesion, @RequestParam(value="lugar")String lugar) {
		
		//variables inicio
		int oro = 0;
		ArrayList<String> resultados = new ArrayList<String>();
		SimpleDateFormat formatoFecha = new SimpleDateFormat("MMMM D Y h:mm a");
		
		//inciar la clave gold
		if(sesion.getAttribute("gold") == null) {
			sesion.setAttribute("gold", oro);
			sesion.setAttribute("resultados", resultados);
		}else {
			oro= (int) sesion.getAttribute("gold");
			resultados =  (ArrayList<String>) sesion.getAttribute("resultados");
		}
		
		// SECCION DE INCREMENTO/DECREMENTO DE ORO
		if(lugar.equals("farm")) {
			int cantidad = new Random().nextInt(11)+10;
			oro += cantidad;
			resultados.add(0,"Entraste a farm y aumentas "+ cantidad + " oro " + formatoFecha.format(new Date()) );
			sesion.setAttribute("gold", oro);
			sesion.setAttribute("resultados", resultados);
			return "redirect:/gold";
		}
		
		
		
		
		return "redirect:/gold";
	}
}