package edu.ucjc.javagrado.ejercicios.bucles;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Fibonacci
		
		int num0 = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Intoduce un numero: ");
		num0 = scan.nextInt();
		System.out.println(num0);
		int num1 = 0, num2 = 1;
        System.out.print("Serie de Fibonacci "+num0+" numeros: ");

        for (int i = 1; i <= num0; ++i)
        {
            System.out.print(num1+" ");
            int suma = num1 + num2;
            num1 = num2;
            num2 = suma;
        }
        
        
        //Ejercicio en clase:
        Scanner scann = new Scanner(System.in);
        System.out.println("Escribe numero de elementos: ");
        int numerosSerie = scann.nextInt();
        int num3 = 0, num4 = 1;
        System.out.print(num3);
        System.out.print(","+num4);
        for (int i = 0; i < numerosSerie-2; i++) {
        	//primero sumas
        	int suma = num3 + num4;
        	//muestra suma
        	System.out.print(","+suma);
        	//Despues, se cambia la segunda variable por la primera 
        	num3 = num4;
        	//Por último, se cambia la suma por la segunda variable
        	num4 = suma;
        }        
    }
}

//next : es hasta el primero espacio en blanco que encuentre

