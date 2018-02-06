package com.paquete.operacion;

import java.util.Scanner;

public class Division {
	
	public void division() throws ArithmeticException, NullPointerException, NumberFormatException {
		

		int indice = 0;
		
		
			
		//try {

			Scanner scan = new Scanner(System.in);
			Scanner scan1 = new Scanner(System.in);
			String numerador_str;
			String denominador_str;
			float division1 = .0f;
			int numerador, denominador;

			System.out.println("Introduce el numerador");
			numerador_str = scan.nextLine();
			numerador = Integer.parseInt(numerador_str);

			System.out.println("Introduce el denominador");
			denominador_str = scan1.nextLine();
			denominador = Integer.parseInt(denominador_str);

			division1 = numerador / denominador;
			
			System.out.println(division1);
			
			
			
//		} catch (ArithmeticException ex) {
//			// Excepcion aritmetica en el caso de vividir entre 0 el valor es incorrecto
//			System.out.print("Introduce un valor");
//			
//		} catch (NullPointerException ex) {
//			// Excepcion si no se inserta ningun valor
//			System.out.print("Introduce un valor");
//		} catch (NumberFormatException ex) {
//			System.out.print("Introduce un numero");
//
//		}
	}
		
	}

	
	

