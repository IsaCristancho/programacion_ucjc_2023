package edu.ucjc.javagrado.poo;

import java.util.Scanner;

public class Tienda {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Cliente c1 = new Cliente();
		// declarando la variable con su tipo,=, posición de memoria
		c1.nombre = "Juan";
		c1.comprar();
		
		System.out.println(c1.nombre);
		Cliente c2 = c1;
		c2.nombre = "María";
		
		System.out.println(c1.nombre);
		
		c2 = null; // significa que el objeto no está apuntando a nada
		System.out.println(c2.nombre);
		
		System.out.println(c1.apellidos);
		System.out.println(c1.edad);
	}

}