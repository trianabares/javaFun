package com.triana.proyectoclass;

public class TestProyectoClass {

	public static void main(String[] args) {
		ProyectoClass proyectoUno = new ProyectoClass();
		ProyectoClass proyectoDos = new ProyectoClass();
		
		proyectoUno.setNombre("ProductoUno");
		proyectoUno.setDescripcion("Producto uno descripcion");
		proyectoUno.setInitialCost(25);
		
		proyectoDos.setNombre("ProyectoDos");
		
		System.out.println(proyectoUno.elevatorPitch(proyectoUno.getNombre(), proyectoUno.getDescripcion(), proyectoUno.getInitialCost()));
		System.out.println(proyectoDos.elevatorPitch(proyectoDos.getNombre()));
		
		Portfolio portfolio = new Portfolio();
        portfolio.agregarProyecto(proyectoUno);
        portfolio.showPortfolio();
        
	}
}
