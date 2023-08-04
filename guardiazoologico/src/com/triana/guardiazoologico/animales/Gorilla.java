package com.triana.guardiazoologico.animales;

import com.triana.guardiazoologico.mammal.Mammal;

public class Gorilla extends Mammal {
	// NO TIENE VARIABLES MIEMBRO MOMENTANEAMENTE
	
	// CONSTRUCTOR HEREDADO DE SUPER CLASE MAMMAL
	public Gorilla() {
		super();
	}
	
	// METODOS PROPIOS
	public void throwSomething() {
		this.setEnergyLevel(this.getEnergyLevel() - 5);
		System.out.println("El gorila ha lanzado algo al público, su nivel de energía bajó y ahora es: " + this.getEnergyLevel());
	}
	
	public void eatBananas() {
		this.setEnergyLevel(this.getEnergyLevel() + 10);
		System.out.println("El gorila ha comido bananas, su nivel de energía subió y ahora es: " + this.getEnergyLevel());
	}
	
	public void climb() {
		this.setEnergyLevel(this.getEnergyLevel() - 10);
		System.out.println("El gorila ha escalado, su nivel de energía bajo y ahora es: " + this.getEnergyLevel());
	}
}
