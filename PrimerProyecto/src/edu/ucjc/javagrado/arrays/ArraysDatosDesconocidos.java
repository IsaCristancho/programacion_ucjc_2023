package edu.ucjc.javagrado.arrays;

import java.util.Scanner;

public class ArraysDatosDesconocidos {

	public static void main(String[] args) {
		// 2 = filas ; 3 = columnas
		int [][] numeros = new int [2][3]; // para matriz, dos corchetes, bidimensional
		
		// 0 = fila ; 1 =  columna
//		numeros[0][1]=19;
		
		//Preguntamos y guardamos datos
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.println("Introduce el elemento ["+i+"],["+j+"]");
				Scanner scan = new Scanner(System.in);
				scan.nextInt();
				numeros[i][j]=scan.nextInt();	
			}
		}
		
		//Mostramos los datos de una matriz
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j]);	
			}
			System.out.println();
		}
	}
}

