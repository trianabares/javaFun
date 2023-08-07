package com.triana.cuentadebanco;

public class TestBankAccount {

	public static void main(String[] args) {
		System.out.println("--- CUENTA A ---");
		BankAccount cuentaA = new BankAccount();
		System.out.println("--- Numero de cuenta ---");
		System.out.println(cuentaA.getNumeroCuenta());
		
		System.out.println("--- Saldo Acutal Cuenta Ahorros ---");
		System.out.println(cuentaA.getSaldoCuentaAhorros());
		
		System.out.println("--- Deposita 100 en Cuenta Ahorros ---");
		cuentaA.depositarCuentaAhorros(100);
		System.out.println(cuentaA.getSaldoCuentaAhorros());
		
		System.out.println("--- Deposita 50 en Cuenta Ahorros ---");
		cuentaA.depositarCuentaAhorros(50);
		System.out.println(cuentaA.getSaldoCuentaAhorros());
		
		System.out.println("--- Intenta Retirar 180 en Cuenta Ahorros ---");
		cuentaA.retirarCuentaAhorros(180);
		System.out.println(cuentaA.getSaldoCuentaAhorros());
		
		System.out.println("--- Retira 100 en Cuenta Ahorros ---");
		cuentaA.retirarCuentaAhorros(100);
		System.out.println(cuentaA.getSaldoCuentaAhorros());
		
		System.out.println("--- Saldo Actual Cuenta Corriente ---");
		System.out.println(cuentaA.getSaldoCuentaCorriente());
		
		System.out.println("--- Deposita 100 en Cuenta Corriente ---");
		cuentaA.depositarCuentaCorriente(100);
		System.out.println(cuentaA.getSaldoCuentaCorriente());
		
		System.out.println("--- Deposita 50 en Cuenta Corriente ---");
		cuentaA.depositarCuentaCorriente(50);
		System.out.println(cuentaA.getSaldoCuentaCorriente());
		
		System.out.println("--- Intenta retirar 180 en Cuenta Corriente ---");
		cuentaA.retirarCuentaCorriente(180);
		System.out.println(cuentaA.getSaldoCuentaCorriente());
		
		System.out.println("--- Retira 100 en Cuenta Corriente ---");
		cuentaA.retirarCuentaCorriente(100);
		System.out.println(cuentaA.getSaldoCuentaCorriente());
		
		System.out.println("--- CUENTA B ---");
		
		BankAccount cuentaB = new BankAccount();
		System.out.println("--- Numero de cuenta ---");
		System.out.println(cuentaB.getNumeroCuenta());
		
		System.out.println("--- Saldo Actual Cuenta Ahorros ---");
		System.out.println(cuentaB.getSaldoCuentaAhorros());
		
		System.out.println("--- Deposita 100 en Cuenta Ahorros---");
		cuentaB.depositarCuentaAhorros(100);
		System.out.println(cuentaB.getSaldoCuentaAhorros());
		
		System.out.println("--- Deposita 50 en Cuenta Ahorros---");
		cuentaB.depositarCuentaAhorros(50);
		System.out.println(cuentaB.getSaldoCuentaAhorros());
		
		System.out.println("--- Intenta Retirar 180 en Cuenta Ahorros ---");
		cuentaB.retirarCuentaAhorros(180);
		System.out.println(cuentaB.getSaldoCuentaAhorros());
		
		System.out.println("--- Retira 100 en Cunenta Ahorros ---");
		cuentaB.retirarCuentaAhorros(100);
		System.out.println(cuentaB.getSaldoCuentaAhorros());
		
		System.out.println("--- Saldo Actual Cuenta Corriente ---");
		System.out.println(cuentaB.getSaldoCuentaCorriente());
		
		System.out.println("--- Deposita 100 en Cuenta Corriente ---");
		cuentaB.depositarCuentaCorriente(100);
		System.out.println(cuentaB.getSaldoCuentaCorriente());
		
		System.out.println("--- Deposita 50 en Cuenta Corriente ---");
		cuentaB.depositarCuentaCorriente(50);
		System.out.println(cuentaB.getSaldoCuentaCorriente());
		
		System.out.println("--- Intenta Retirar 180 en Cuenta Corriente---");
		cuentaB.retirarCuentaCorriente(180);
		System.out.println(cuentaB.getSaldoCuentaCorriente());
		
		System.out.println("--- Retira 100 en Cuenta Corriente ---");
		cuentaB.retirarCuentaCorriente(100);
		System.out.println(cuentaB.getSaldoCuentaCorriente());
		
		System.out.println("--- CANTIDAD DE CUENTAS DE BANCO CREADAS HASTA EL MOMENTO ---");
		System.out.println(BankAccount.getCuentasCreadas());
	}

}
