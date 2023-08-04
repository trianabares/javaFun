package com.triana.guardiazoologico.animales;

import com.triana.guardiazoologico.mammal.Mammal;

public class Bat extends Mammal {
	
	// CONSTRUCTOR HEREDADO DE SUPER CLASE MAMMAL
	public Bat() {
		super();
		this.setEnergyLevel(300);
	}
	
	// METODOS
	public void fly() {
		this.setEnergyLevel(this.getEnergyLevel() - 50);
		System.out.println("*Sonido de murcielago*");
	}
	
	public void eatHumans() {
		this.setEnergyLevel(this.getEnergyLevel() - 50);
		System.out.println("Bueno, no importa...");
	}
	
	public void attackTown() {
		this.setEnergyLevel(this.getEnergyLevel() - 50);
		System.out.println("*Sonido de ciudad en llamas*");
	}
}
