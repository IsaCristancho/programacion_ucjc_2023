package edu.ucjc.javagrado.utils;

import java.util.Scanner;

public class UtilidadesEjercicios {
	
	
	
	public static void validarEmail(String email) {
		String mensajeError = "";
		
		//Quitamos espacios en blanco a izquierda y derecha 
		email = email.trim();
		
		//Controlamos el número de @
		if (email.indexOf("@")==-1) {
			mensajeError += "El email debe tener un @";
		}else if (email.indexOf("@")!=email.lastIndexOf("@")) {
			mensajeError += "Solo debe de haber un @";
		}
		
		//No debe tener espacios en blanco
		if (email.contains(" ")) {
			mensajeError += "No puede tener espacios en blanco";
		}
		
		//Después del @ tiene que haber al menos un punto .
		
		//Primera forma
//		if (email.lastIndexOf(".")<email.lastIndexOf("@")) {
//			mensajeError += "Despues del @ debe haber un punto .";
//		}
		
		//Segunda forma del Punto
		int posicionArroba = email.indexOf("@");
		String dominio = email.substring(posicionArroba+1);
		if (email.contains("@") && !dominio.contains(".")) { // && doble porque si la primera es falsa no evalua la otra.
			mensajeError += "Despues de la @ tiene que haber un punto.";
		}else {
			//Miramos la longitud desde el último punto
			int posicionUltimoPunto = dominio.lastIndexOf(".");
			String subdominio = dominio.substring(posicionUltimoPunto+1);
			if (subdominio.length()<2 || subdominio.length()>6) {
				mensajeError += "Despues del último punto no puede haber menos de 2 ni más de 6 caracteres.";
			}
		}
		
		if (mensajeError.equals("")) {
			System.out.println("El email "+email+" es correcto");
		}else {
			System.out.println("El email "+email+" no es correcto");
			System.out.println(mensajeError);
		}
	}

	public static void validarEmail() {
		System.out.println("Validar Email");
		System.out.println("Introduce tu email: ");
		Scanner scan = new Scanner(System.in); 
		String email = scan.nextLine();
		System.out.println();
		validarEmail();
		
		
	}	
}
