package com.triana.enrutamientos.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	
	@RequestMapping("")
	public String home() {
		return "Pagina principal";
	}
	@RequestMapping("/{track}")
    public String enrutamientos(@PathVariable("track") String track){
		if(track.contentEquals("dojo")) {
			return "El Dojo es increible!";
		} else if(track.contentEquals("burbank-dojo")) {
			return "El Dojo Burbank está localizado al sur de California";
		} else if(track.contentEquals("san-jose")) {
			return "El Dojo SJ es el cuartel general";
		}
		return "Dirección no encontrada";
    }

}
