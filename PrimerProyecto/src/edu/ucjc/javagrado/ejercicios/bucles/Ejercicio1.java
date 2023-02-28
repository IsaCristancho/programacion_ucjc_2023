package edu.ucjc.javagrado.ejercicios.bucles;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("Numeros pares: ");
//	int x;
//	for (int i=1;i<50;i++) {
//		x=i*2;
//	System.out.println("Numeros pares del 1 al 100: "+x);	
//	}
//		
//	//Otro intento
//	int suma = 0;
//	for (int j = 1; j<100; j++) {
//		if(j%2==0) {
//			suma +=j;
//		}
//	}
//		System.out.println("Numeros pares: del 1 al 100: ");

		
		// Ejercicio resuelto en clase:
		
		for (int par=2, impar=99; par<=100; par+=2, impar-=2) {
			System.out.println(par+"\t"+impar);
		}
		}
	}

