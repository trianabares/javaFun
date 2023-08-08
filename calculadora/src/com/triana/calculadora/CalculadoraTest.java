package com.triana.calculadora;

public class CalculadoraTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calculator = new Calculadora();
        calculator.setOperandOne(10.5);
        calculator.setOperation("+");
        calculator.setOperandTwo(5.2);
        double result = calculator.getResult();
        System.out.println("El resultado es: " + result);
	}

}
