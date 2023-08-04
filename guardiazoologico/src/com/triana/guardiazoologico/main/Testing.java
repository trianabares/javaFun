package com.triana.guardiazoologico.main;

import com.triana.guardiazoologico.animales.Bat;
import com.triana.guardiazoologico.animales.Gorilla;

public class Testing {

	public static void main(String[] args) {
		Gorilla gorilla = new Gorilla();
		Bat bat = new Bat();
		
		// EJERCICIO GUARDIA ZOO 1
		System.out.println("EJERCICIO GUARDIA ZOO 1");
		
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
		
		// EJERCICIO GUARDIA ZOO 2
		System.out.println("EJERCICIO GUARDIA ZOO 2");
		
		System.out.println(" --- EL MURCIELAGO ATACA LA CIUDAD TRES VECES ---");
		System.out.println("El nivel de energía del murciélago ahora es: " + bat.displayEnergy());
		bat.attackTown();
		bat.attackTown();
		bat.attackTown();
		System.out.println("El nivel de energía del murciélago ahora es: " + bat.displayEnergy());
		
		System.out.println(" --- EL MURCIELAGO COME HUMANOS DOS VECES ---");
		bat.eatHumans();
		bat.eatHumans();
		System.out.println("El nivel de energía del murciélago ahora es: " + bat.displayEnergy());
		
		System.out.println(" --- EL MURCIELAGO VUELA DOS VECES ---");
		bat.fly();
		bat.fly();
		System.out.println("El nivel de energía del murciélago ahora es: " + bat.displayEnergy());
		
	}

}
