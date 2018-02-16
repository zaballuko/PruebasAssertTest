package com.paquete.operacion;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		int dividendo = 0;
		int divisor = 0;

		/*
		 * Division pedirDividenvo = new Division();
		 * pedirDividenvo.pedirDividenvo(dividendo);
		 * 
		 * Division pedirDivisor = new Division();
		 * 
		 * pedirDivisor.pedirDivisor(divisor);
		 */
		try {

			Division division = new Division();
			// division.division(dividendo, divisor);
			division.division(7, 0);
			fail("Introduce un valor diferente de 0");

		} catch (ArithmeticException ex) {
			// Excepcion aritmetica en el caso de vividir entre 0 el valor es
			// incorrecto
			System.out.print("Introduce un valor");

		}

	}

}
