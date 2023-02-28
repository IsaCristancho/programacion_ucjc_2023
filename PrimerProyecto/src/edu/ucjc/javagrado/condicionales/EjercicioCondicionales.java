package edu.ucjc.javagrado.condicionales;

import java.util.Scanner;

public class EjercicioCondicionales {

	public static void main(String[] args) {
//		String mes = "Enero";
//		if (mes == "Enero" || mes == "Febrero" || mes == "Marzo") {
//			System.out.println("Invierno"); 
//		}else if (mes == "Abril" || mes == "Mayo" || mes == "Junio") {
//			System.out.println("Primavera"); 
//		}else if (mes == "Julio" || mes == "Agosto" || mes == "Septiembre") {
//				System.out.println("Verano");
//		}else if (mes == "Octubre" || mes == "Noviembre" || mes == "Diciembre") {
//			System.out.println("Otoño");}
//// EJERCICIO MALO, PARA LOS STRINGS NO SE USA == PARA COMPARAR, ES MES.EQUALS("ENERO"), SI SE PONE ASÍ EN EL EXAMEN, PENALIZA
//		
//		
//		//Switch
//		String mes1 = "Enero";
//		switch (mes1) {
//		case "Enero":System.out.println("Invierno");break;
//		case "Febrero":System.out.println("Invierno");break;
//		case "Marzo":System.out.println("Invierno");break;
//		case "Abril":System.out.println("Primavera");break;
//		case "Mayo":System.out.println("Primavera");break;
//		case "Junio":System.out.println("Primavera");break;
//		case "Julio":System.out.println("Verano");break;
//		case "Agosto":System.out.println("Verano");break;
//		case "Septiembre":System.out.println("Verano");break;
//		case "Octubre":System.out.println("Otoño");break;
//		case "Noviembre":System.out.println("Otoño");break;
//		case "Diciembre":System.out.println("Otoño");break;
//		default: System.out.println("No es un mes");}
//		}
//}
		
		String mes = "Enero";
		Scanner scan = new Scanner(System.in);
		System.out.println("Intoduce el nombre del mes");
		mes = scan.nextLine(); //nextLine es porque va a ser un string
		System.out.println(mes);
		
		//Usando el if
		String estacion = "";
		if (mes.equalsIgnoreCase("Enero") || mes.equalsIgnoreCase("Febrero") || mes.equalsIgnoreCase("Marzo")) {
			estacion = "Invierno"; 
		}else if (mes.equalsIgnoreCase("Abril") || mes.equalsIgnoreCase("Mayo") || mes.equalsIgnoreCase("Junio")) {
			estacion = "Primavera";
		}else if (mes.equalsIgnoreCase("Julio") || mes.equalsIgnoreCase("Agosto") || mes.equalsIgnoreCase("Septiembre")) {
			estacion = "Verano";
		}else if (mes.equalsIgnoreCase("Octubre") || mes.equalsIgnoreCase("Noviembre") || mes.equalsIgnoreCase("Diciembre")) {
			estacion = "Otoño";
		}else {
			estacion = "Te has equivocado";
		}
		System.out.println("Estacion: " + estacion);
		
		
		//Usando el switch
		switch (mes.toLowerCase()) {
		case "enero":
		case "febrero":
		case "marzo":System.out.println("Invierno");break;
		case "abril":
		case "mayo":
		case "junio":System.out.println("Primavera");break;
		case "julio":
		case "agosto":
		case "septiembre":System.out.println("Verano");break;
		case "octubre":
		case "noviembre":
		case "diciembre":System.out.println("Otoño");break;
		default: System.out.println("No es un mes");
		}
				

	}

}