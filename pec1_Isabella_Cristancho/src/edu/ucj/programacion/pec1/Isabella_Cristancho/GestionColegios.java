package edu.ucj.programacion.pec1.Isabella_Cristancho;

import java.util.Scanner;

public class GestionColegios {

	public static void main(String[] args) {
		
		// Le declaro un valor, ya que daba error
		String nombreColegio = ""; 
		String direccion = "";
		
		Colegio colegio = new Colegio(); // Se crea el objeto colegio
		
	    Scanner scan = new Scanner(System.in); 
		System.out.print("Indique el nombre del colegio: ");
		nombreColegio = scan.nextLine(); // Se guarda lo que introducio el usuario
		colegio.setNombre(nombreColegio); // Se guarda en el nombre de la clase Colegio
	
		System.out.print("Indique la direccion: ");
		direccion = scan.nextLine(); //Se guarda lo que introducio el usuario
		colegio.setDireccion(direccion); // Se guarda en la direccion de la clase Colegio
		
		System.out.print("Indique el numero de aulas: ");
		int num = scan.nextInt(); //Se guarda lo que introducio el usuario
		
		Aula [] aulas = new Aula[num]; // Se crea el objeto con el numero de aulas establecido por el usuario
		for (int i=0; i<num ; i++) {  // Bucle for que se ejecutara tantas veces haya puesto el usuario las aulas.
			System.out.print("Indique el numero de clase del Aula #"+ (i+1) +": "); 
			int numeroClase = scan.nextInt(); // Se guarda lo que introducio el usuario
			
			System.out.print("Indique el numero de la planta del Aula #"+ (i+1) +": ");
			int numeroPlanta = scan.nextInt(); // Se guarda lo que introducio el usuario
			
			Profesor profesor = UtilsColegio.crearProfesor(); /* Se llama a la clase crearProfesor ya que este se 
			// ejecutara tantas veces haya aulas, porque va un Profesor por aula. */
			
			Aula aula = new Aula(numeroClase, numeroPlanta, profesor, null); /* Se guarda toda esta informacion en el
			objeto aula */ 
			aulas[i] = aula; //esto llena la posicion dentro del arreglo de aulas
		
		}
		
		colegio.setAulas(aulas); /* Esto va fuera del for, ya que se van a guardar todas las aulas con su nueva 
		informacion */
		
		// Se le pide al usuario cuantos alumnos quiere
		System.out.print("Indique el numero de Alumnos a crear: ");
		int numeroAlumnos = scan.nextInt(); // Se guarda 
		Alumno [] alumnos = new Alumno[numeroAlumnos]; /* Se declara un nuevo objeto de Alumno como un array 
		y le pasas la cantidad de alumnos para poder rellenar toda la infromacion de todos los alumnos */
		
		for (int i=0; i<numeroAlumnos; i++) { // Bucle for para que pida la informacion de todos los alumnos
			Alumno alumno = UtilsColegio.crearAlumno(); /* Se llama al metodo crear alumno, ya que es el que 
			pide toda la informacion*/
			alumnos[i] = alumno; /* Aqui guarda a alumno (su informacion) en la posicion del array alumnos (la que
			se pidio antes */
			
		}
		
		/* Proceso de inscripcion
		Llama al metodo para que se ejecute */
		asignacion(colegio, alumnos);
	}

	// Metodo para asignar
	public static void asignacion(Colegio colegio, Alumno[] alumnos) { // Recibe como parametro al colegio y alumnos
		for (Alumno alumno : alumnos) {
			if (colegio.asignSeat(alumno)) { // llama al metodo asignSeat en colegio
				System.out.println("El alumno " + alumno.getNombre() +" se inscribio con exito en el colegio " 
			+ colegio.getNombre() + " que queda en " + colegio.getDireccion()); // Imprime que se inscribio perfecto el alumno
			}else {
				System.out.println("En el colegio " +colegio.getNombre()+ " no quedan asientos disponibles en "
						+ "las aulas."); // Si no se pudo asignar el puesto, pues imprime esto porque ya no hay mas aulas.
			}
			
		}
	}
}
