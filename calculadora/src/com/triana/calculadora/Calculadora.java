package com.triana.calculadora;

public class Calculadora {
	// ATRIBUTOS
	private double operandOne;
	private double operandTwo;
	private String operation;
	private double resultado;
	
	// CONSTRUCTOR 
	
	public Calculadora() {}
	
	public Calculadora(double operandOne, double operandTwo, String operation) {
		this.operandOne = operandOne;
		this.operandTwo = operandTwo;
		this.operation = operation;
	}
	
	// METODOS
	
	private void performOperation() {
		double numUno = this.operandOne;
		double numDos = this.operandTwo;
		String sim = this.operation;
		if(sim == "+") {
			resultado = numUno + numDos;
		} else if(sim == "-") {
			resultado = numUno - numDos;
		} else {
			System.out.println("No puede realizarse la operación");
		}
	}
	
	public double getResult() {
		performOperation();
		return resultado;
	}
	
	// GETTERS Y SETTERS

	public double getOperandOne() {
		return operandOne;
	}

	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}

	public double getOperandTwo() {
		return operandTwo;
	}

	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	
	
}
