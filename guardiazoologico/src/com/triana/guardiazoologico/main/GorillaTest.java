package com.triana.guardiazoologico.main;

import com.triana.guardiazoologico.animales.Gorilla;

public class GorillaTest {

	public static void main(String[] args) {
		Gorilla gorilla = new Gorilla();
		
		System.out.println(" --- NIVEL INICIAL DE ENERGIA --- ");
		gorilla.displayEnergy();
		
		System.out.println(" --- EL GORILA LANZA ALGO --- ");
		gorilla.throwSomething();
		gorilla.displayEnergy();
		
		System.out.println(" --- EL GORILA LANZA ALGO --- ");
		gorilla.throwSomething();
		gorilla.displayEnergy();
		
		System.out.println(" --- EL GORILA LANZA ALGO --- ");
		gorilla.throwSomething();
		gorilla.displayEnergy();
		
		System.out.println(" --- EL GORILA COME BANANAS --- ");
		gorilla.eatBananas();
		gorilla.displayEnergy();
		
		System.out.println(" --- EL GORILA COME BANANAS --- ");
		gorilla.eatBananas();
		gorilla.displayEnergy();
		
		System.out.println(" --- EL GORILA TREPA --- ");
		gorilla.climb();
		gorilla.displayEnergy();
		
		
	}

}
