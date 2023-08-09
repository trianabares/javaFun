package com.triana.cadenas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cadenas {

	@RequestMapping("/")
	public String bienvenida() {
		return "Bienvenido, Cliente! Que tenga un buen día!";
	}

	@GetMapping("/random")
	public String random() {
		return "Spring boot es genial!";
	}
}
