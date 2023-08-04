package com.triana.maestroobjetos.classes;

import com.triana.maestroobjetos.human.Human;

public class Ninja extends Human {
	
	// CONSTRUCTOR 
	public Ninja() {
		super();
		this.setStealth(10);
	}
	
	// METODOS
	
	public void steal(Human human) {
		human.setHealth(human.getHealth() - this.getStealth());
		this.setHealth(this.getHealth() + this.getStealth());
	}
	
	public void runAway() {
		this.setHealth(this.getHealth() - 10);
	}

}
