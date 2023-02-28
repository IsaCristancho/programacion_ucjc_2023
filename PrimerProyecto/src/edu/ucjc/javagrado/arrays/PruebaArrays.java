package edu.ucjc.javagrado.arrays;

public class PruebaArrays {

	public static void main(String[] args) {
		//Tienen un tamaño fijo, pueden tener más de una dimensión
		
		//Arrays, matrices o arreglos
		String [] colores = {"Blanco", "Azul", "Rojo"};
		System.out.println(colores[0]); //Recuperar el valor por la posición, primera posición = 0
		
		for ( int i =0 ; i<colores.length ; i++ ) {
			System.out.println(colores[i]); // para recorrer uno por uno en el array
		}
		System.out.println("=================");
		for ( String color : colores ) { // for each; aquí recorre de manera automatica el array.
			System.out.println(color);
			
				
			}
		}
	}


