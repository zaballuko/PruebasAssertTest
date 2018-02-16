package com.paquete.operacion;

import java.util.Scanner;

public class Division {



	public int pedirDividenvo(int dividendo)throws NullPointerException, NumberFormatException {
		Scanner scan = new Scanner(System.in);
		String dividendo_str;

		System.out.println("Introduce el dividendo");
		dividendo_str = scan.nextLine();
		dividendo = Integer.parseInt(dividendo_str);

		return dividendo;

	}

	public int pedirDivisor(int divisor) {
		Scanner scan1 = new Scanner(System.in);

		String divisor_str;
		System.out.println("Introduce el divisor");
		divisor_str = scan1.nextLine();
		divisor = Integer.parseInt(divisor_str);
		return divisor;
	}
	public float division(int dividendo, int divisor)
			throws ArithmeticException {

		float division = .0f;

		division = dividendo / divisor;

		return division;

	}

}
