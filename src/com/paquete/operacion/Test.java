package com.paquete.operacion;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {

		try {
			Division division = new Division();
			division.division();

		} catch (ArithmeticException ex) {
			// Excepcion aritmetica en el caso de vividir entre 0 el valor es
			// incorrecto
			System.out.print("Introduce un valor");
			fail("Introduce un valor");
			

		} catch (NullPointerException ex) {
			// Excepcion si no se inserta ningun valor
			System.out.print("Introduce un valor");
			fail("Introduce un valor");
			
		} catch (NumberFormatException ex) {
			System.out.print("Formato erroneo");
			fail("Formato erroneo");
			
		}
	}

}
