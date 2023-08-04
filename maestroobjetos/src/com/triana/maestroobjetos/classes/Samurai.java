package com.triana.maestroobjetos.classes;

import com.triana.maestroobjetos.human.Human;

public class Samurai extends Human {
	
	// ATRIBUTOS DE SAMURAI
	private int cantidad = 0;
	
	// CONSTRUCTOR
	public Samurai() {
		super();
		this.setHealth(200);
		
		cantidad++;
	}
	
	// METODOS	
	
	public void deathBlow(Human human) {
		human.setHealth(0);
		this.setHealth(this.getHealth() / 2);
	}
	
	public void meditate() {
		this.setHealth(this.getHealth() + this.getHealth() / 2);
	}
	
	public void howMany() {
		System.out.println("La cantidad de Samurais es de: " + this.getCantidad());
	}
	
	// GETTERS Y SETTERS

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
}
