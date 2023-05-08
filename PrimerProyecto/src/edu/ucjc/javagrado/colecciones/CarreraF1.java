package edu.ucjc.javagrado.colecciones;

import java.util.ArrayList;
import java.util.List;

public class CarreraF1 {

	public static void main(String[] args) {
		
		List<String> patrocinadores1 = new ArrayList<String>();
		patrocinadores1.add("Red Bull");
		patrocinadores1.add("Isabellasifuesemillionaria");
		
		List<String> patrocinadores2 = new ArrayList<String>();
		patrocinadores2.add("Red Bull");
		
		List<String> patrocinadores3 = new ArrayList<String>();
		patrocinadores3.add("Mariatonta");
		
		CocheF1 coche1 = new CocheF1(1, "Isabella", "Villafranca", patrocinadores1, 300);
		CocheF1 coche2 = new CocheF1(87, "Maria", "RayoMcqueen", patrocinadores2, 400);
		CocheF1 coche3 = new CocheF1(99, "Jose Luis", "Java", patrocinadores3, 350);
		
		List<CocheF1> coches = new ArrayList<CocheF1>();
		coches.add(coche1);
		coches.add(coche2);
		coches.add(coche3);
		
//		List<CocheF1> coches = Arrays.asList(coche2,coche3,coche1);
//		cf1.muestraInfoCoches(coches);
//		cf1.correrCoches(coches);
		
		CarreraF1 cf1 = new CarreraF1();
		mostrarInfoCoches(coches);
		calcularVelocidadMedia(coches);
	}	
		
	public static void mostrarInfoCoches(List<CocheF1> coches) {
		for (CocheF1 coche : coches) {
			coche.correr();
		}
	}
	
	public static void calcularVelocidadMedia(List<CocheF1> coches) {
		int sumaVelocidades = 0;
		int numCochesRedBull = 0;
		
		for (CocheF1 coche : coches) {
			if (coche.getPatrocinadores().contains("Red Bull")) {
				numCochesRedBull ++;
				sumaVelocidades += coche.getVelMaxima();
			}
		}
		int velMedia = sumaVelocidades/numCochesRedBull;
		System.out.println("La velocidad media de los coches que tienen como patrocinador a Red Bull es de "+velMedia);
	}
}