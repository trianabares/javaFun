package com.triana.proyectoclass;

import java.util.ArrayList;

public class Portfolio {
	private ArrayList<ProyectoClass> proyectos;

	// CONSTRUCTOR
	public Portfolio(ArrayList<ProyectoClass> proyectos) {
		this.proyectos = proyectos;
	}
	
	public Portfolio() {
        proyectos = new ArrayList<ProyectoClass>();
    }

	// AGREGAR PROYECTO AL PORTFOLIO
	public void agregarProyecto(ProyectoClass proyecto) {
		this.proyectos.add(proyecto);
	}

	// CALCULA Y DEVUELVE EL COSTO TOTAL DEL PORTAFOLIO COMPLETO
	public double getPortfolioCost() {
		double total = 0;
		for (ProyectoClass proyecto : proyectos) {
			total += proyecto.getInitialCost();
		}
		return total;
	}

	// MUESTRA EN PASNTALLA TODOS LOS PROYECTOS EN FORMATO ELEVATORPICHES,
	// SEGUIDO DEL COSTO TOTAL.
	public void showPortfolio() {
		for (ProyectoClass proyecto : proyectos) {
			System.out.println(proyecto.elevatorPitch(proyecto.getNombre(), proyecto.getDescripcion(), proyecto.getInitialCost()));
		}
		System.out.println("Costo total del portfolio: " + getPortfolioCost());
	}

	// GETTERS Y SETTERS
	public ArrayList<ProyectoClass> getProyectos() {
		return proyectos;
	}

	public void setProyectos(ArrayList<ProyectoClass> proyectos) {
		this.proyectos = proyectos;
	}

}
