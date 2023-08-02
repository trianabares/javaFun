package com.triana.proyectoclass;

public class ProyectoClass {
	private String nombre;
	private String descripcion;
	private double initialCost;

	public String elevatorPitch(String nombre) {
		return nombre;
	}
	
	public String elevatorPitch(String nombre, String descripcion, double initialCost) {
		return nombre + "(" + initialCost + ")" + ":" + descripcion;
	}

	// CONSTRUCTORES

	public ProyectoClass(String nombre, String descripcion, double initialCost) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.initialCost = initialCost;
	}

	public ProyectoClass(String nombre) {
		this.nombre = nombre;
	}

	public ProyectoClass() {
	}

	// GETTERS Y SETTERA

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public double getInitialCost() {
		return initialCost;
	}

	public void setInitialCost(double initialCost) {
		this.initialCost = initialCost;
	}

}
