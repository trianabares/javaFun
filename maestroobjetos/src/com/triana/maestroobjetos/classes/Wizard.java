package com.triana.maestroobjetos.classes;

import com.triana.maestroobjetos.human.Human;

public class Wizard extends Human {

	// CONSTRUCTOR
	public Wizard() {
		super();
		this.setHealth(50);
		this.setIntelligence(8);
	}
	
	// METODOS
	
	public void heal(Human human) {
		human.setHealth(human.getHealth() + this.getIntelligence());
	}
	
	public void fireBall(Human human) {
		human.setHealth(human.getHealth() - 3 * this.getIntelligence());
	}
	
}
