package com.triana.maestroobjetos.main;

import com.triana.maestroobjetos.classes.Ninja;
import com.triana.maestroobjetos.classes.Samurai;
import com.triana.maestroobjetos.classes.Wizard;

public class HumanTest {

	public static void main(String[] args) {
		Wizard wizard = new Wizard();
		Ninja ninja = new Ninja();
		Samurai samurai = new Samurai();
		
		System.out.println(" --- NIVEL DE VIDA INICIAL --- ");
		System.out.print("Wizard: ");
		System.out.println(wizard.getHealth());
		System.out.print("Ninja: ");
		System.out.println(ninja.getHealth());
		System.out.print("Samurai: ");
		System.out.println(samurai.getHealth());
		
		System.out.println(" --- EL WIZARD ATACA AL NINJA --- ");
		wizard.attack(ninja);
		System.out.println("Nivel de vida de ninja: " + ninja.getHealth());
		
		System.out.println(" --- EL NINJA ATACA AL SAMURAI --- ");
		ninja.attack(samurai);
		System.out.println("Nivel de vida de samurai: " + samurai.getHealth());
		
		System.out.println(" --- EL SAMURAI ATACA AL WIZARD --- ");
		samurai.attack(wizard);
		System.out.println("Nivel de vida de wizard: " + wizard.getHealth());
		
		System.out.println(" --- EL WIZARD SE CURA A SI MISMO --- ");
		wizard.heal(wizard);
		System.out.println("Nivel de vida de wizard: " + wizard.getHealth());
		
		System.out.println(" --- EL WIZARD LANZA UNA BOLA DE FUEGO AL SAMURAI --- ");
		wizard.fireBall(samurai);
		System.out.println("Nivel de vida de samurai: " + samurai.getHealth());
		
		System.out.println(" --- EL NINJA ROBA SALUD AL SAMURAI --- ");
		ninja.steal(samurai);
		System.out.println("Nivel de vida de samurai: " + samurai.getHealth());
		System.out.println("Nivel de vida de ninja: " + ninja.getHealth());
		
		System.out.println(" --- EL NINJA HUYE --- ");
		ninja.runAway();
		System.out.println("Nivel de vida de ninja: " + ninja.getHealth());
		
		System.out.println(" --- EL SAMURAI DA GOLPE MORAL AL WIZARD --- ");
		samurai.deathBlow(wizard);
		System.out.println("Nivel de vida de wizard: " + wizard.getHealth());
		System.out.println("Nivel de vida de samurai: " + samurai.getHealth());
		
		System.out.println(" --- EL SAMURAI MEDITA --- ");
		samurai.meditate();
		System.out.println("Nivel de vida de samurai: " + samurai.getHealth());
		
		System.out.println(" - Cantidad de Samurai - ");
		samurai.howMany();
	}

}
