package com.triana.cuentadebanco;

import java.util.Random;

public class BankAccount {
	// ATRIBUTOS
	private String numeroCuenta;
	private double saldoCuentaCorriente;
	private double saldoCuentaAhorros;
	
	// ATRIBUTOS ESTATICOS
	private static int cuentasCreadas = 0;
	private static double dineroAlmacenado = 0;
	
	// METODOS PARA DEPOSITAR DINERO
	public void depositarCuentaCorriente(double cantidad) {
		this.setSaldoCuentaCorriente(this.getSaldoCuentaCorriente() + cantidad);
		BankAccount.setDineroAlmacenado(BankAccount.getDineroAlmacenado() + cantidad);
	}
	
	public void depositarCuentaAhorros(double cantidad) {
		this.setSaldoCuentaAhorros(this.getSaldoCuentaAhorros() + cantidad);
		BankAccount.setDineroAlmacenado(BankAccount.getDineroAlmacenado() + cantidad);
		
	}
	
	// METODOS PARA RETIRAR DINERO
	public void retirarCuentaCorriente(double cantidad) {
		if (cantidad > this.getSaldoCuentaCorriente()) {
			System.out.println("No tiene saldo suficiente");
		} else {
			this.setSaldoCuentaCorriente(this.getSaldoCuentaCorriente() - cantidad);
			BankAccount.setDineroAlmacenado(BankAccount.getDineroAlmacenado() - cantidad);
		}
	}
	
	public void retirarCuentaAhorros(double cantidad) {
		if (cantidad > this.getSaldoCuentaAhorros()) {
			System.out.println("No tiene saldo suficiente");
		} else {
			this.setSaldoCuentaAhorros(this.getSaldoCuentaAhorros() - cantidad);
			BankAccount.setDineroAlmacenado(BankAccount.getDineroAlmacenado() - cantidad);
		}
	}
	
	// METODO QUE GENERA UN NUMERO DE DE 10 DIGITOS ALEATORIO
	Random random = new Random();
	private String generarNroCuenta() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            int digito = random.nextInt(10);
            sb.append(digito);
        }
        return sb.toString();
    }
	
	// METODO PARA VER EL DINERO TOTAL
	public void dineroTotal() {
		double total = BankAccount.getDineroAlmacenado();
		total = this.getSaldoCuentaCorriente() + this.getSaldoCuentaAhorros();
		System.out.println("Su dinero total es de: " + total);
	}
	
	// METODO TOTAL DINERO EN EL BANCO
	public static void totalDinero() {
		double totalBanco = BankAccount.getDineroAlmacenado();
		System.out.println("El dinero total en el banco es de: " + totalBanco);
	}
	
	// CONSTRUCTOR
	public BankAccount() {
		numeroCuenta = generarNroCuenta();
		cuentasCreadas++;
	}
	
	// GETTERS Y SETTERS
	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldoCuentaCorriente() {
		return saldoCuentaCorriente;
	}

	public void setSaldoCuentaCorriente(double saldoCuentaCorriente) {
		this.saldoCuentaCorriente = saldoCuentaCorriente;
	}

	public double getSaldoCuentaAhorros() {
		return saldoCuentaAhorros;
	}

	public void setSaldoCuentaAhorros(double saldoCuentaAhorros) {
		this.saldoCuentaAhorros = saldoCuentaAhorros;
	}

	public static int getCuentasCreadas() {
		return cuentasCreadas;
	}

	public static void setCuentasCreadas(int cuentasCreadas) {
		BankAccount.cuentasCreadas = cuentasCreadas;
	}

	public static double getDineroAlmacenado() {
		return dineroAlmacenado;
	}

	public static void setDineroAlmacenado(double dineroAlmacenado) {
		BankAccount.dineroAlmacenado = dineroAlmacenado;
	}

}
