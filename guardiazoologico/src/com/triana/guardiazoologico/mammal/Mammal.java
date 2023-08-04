package com.triana.guardiazoologico.mammal;

public class Mammal {
	// VARIABLES MIEMBRO
	private int energyLevel;
	
	// CONSTRUCTORES 
	public Mammal() {
		this.energyLevel = 100;
	}
	
	// METODOS PROPIOS
	public int displayEnergy() {
		System.out.println(energyLevel);
		return energyLevel;
	}
	
	// GETTERS Y SETTERS
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
}
