package edu.ucjc.javagrado.ejercicios.bucles;

import java.util.Scanner;

import edu.ucjc.javagrado.ejercicios.pojos.Persona;
import edu.ucjc.javagrado.utils.UtilidadesEjercicios;

public class Ejercicio3 {

	public static void main(String[] args) {
// boolean salir = false;  //Variable booleana, se pone false para que cuando quiera salir del bucle, se ponga true

        //Ejercicio resuelto en clase:
        int opcion = 0;
        
        do {
        	System.out.println("1. Validar email");
        	System.out.println("2. Pintar cuadrado");
        	System.out.println("3. Mostrar datos");
        	System.out.println("4. Salir");
        	
        	System.out.println("Selecciona una opción: ");
        	Scanner scan = new Scanner(System.in);
        	opcion = scan.nextInt(); // nextInt, porque va a ser un número, nextLine para string
        	
        	switch (opcion) {  
            case 1: UtilidadesEjercicios.validarEmail();break;
            case 2: pintaCuadrado();break;
            case 3: mostrarDatos();break;
            case 4:System.out.println("¡Vale hasta pronto!");break;
            default:System.out.println("Opción incorrecta"); 
          }

        }while (opcion!=4); // while (!4) mientras que la opción sea distinto a 4, se sigue ejecutando
      }
	public static void pintaCuadrado() {
			System.out.println("Pintando cuadrado");
			int numLados = 5;
			for (int i=0;i<numLados;i++) { //Filas
				for (int j=0; j<numLados; j++) { //Columnas
					if (i == 0 || i ==numLados-1){ //Primera y última fila
						System.out.print("*\t");
					}else {
						if (j == 0 || j ==numLados-1) {
							System.out.print("*\t");
						}else {
							System.out.print("\t");
				}
			}
		}
		System.out.println();
	}	
}

	//Método mostrarDatos()
	public static void mostrarDatos() {
		//Defino objetos de tipo persona
		Persona persona1 = new Persona("Persona1",
				"Apellidos1","1111A","asdasd@asdas.es");
		Persona persona2 = new Persona("Persona2",
				"Apellidos2","2222B","asdasd@asdas.es");
		Persona persona3 = new Persona("Persona3",
				"Apellidos3","3333C","asdasd@asdas.es");
		
		//Array de personas
		Persona [] personas = { persona1, persona2, persona3 };
		
		//System.out.println(personas[0].getNombre());
		for (Persona persona : personas) {
			System.out.println(persona.getNombre());
	}
}
}

