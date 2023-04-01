package edu.ucj.programacion.pec1.Isabella_Cristancho;

import java.util.Scanner;

public class GestionColegios {

	public static void main(String[] args) {
		
		String nombreColegio = "";
		String direccion = "";
		
		Colegio colegio = new Colegio();
		
	    Scanner scan = new Scanner(System.in);
		System.out.print("Indique el nombre del colegio: ");
		nombreColegio = scan.nextLine();
		colegio.setNombre(nombreColegio);
	
		System.out.print("Indique la direccion: ");
		direccion = scan.nextLine();
		colegio.setDireccion(direccion);
		
		System.out.print("Indique el numero de aulas: ");
		int num = scan.nextInt();
		
		Aula [] aulas = new Aula[num];
		for (int i=0; i<num ; i++) {
			System.out.print("Indique el numero de clase del Aula #"+ (i+1) +": ");
			int numeroClase = scan.nextInt();
			
			System.out.print("Indique el numero de la planta del Aula #"+ (i+1) +": ");
			int numeroPlanta = scan.nextInt();
			
			Profesor profesor = UtilsColegio.crearProfesor();
			
			Aula aula = new Aula(numeroClase, numeroPlanta, profesor, null);
			aulas[i] = aula; //esto llena la posicion dentro del arreglo de aulas
		
		}
		
		colegio.setAulas(aulas);
			
		System.out.print("Indique el numero de Alumnos a crear: ");
		int numeroAlumnos = scan.nextInt();
		Alumno [] alumnos = new Alumno[numeroAlumnos];
		for (int i=0; i<numeroAlumnos; i++) {
			Alumno alumno = UtilsColegio.crearAlumno();
			alumnos[i] = alumno;
			
		}
		
		// Proceso de inscripcion
		// Llama al metodo para que se ejecute
		asignacion(colegio, alumnos);
	}

	
	public static void asignacion(Colegio colegio, Alumno[] alumnos) {
		for (Alumno alumno : alumnos) {
			if (colegio.asignSeat(alumno)) {
				System.out.println("El alumno " + alumno.getNombre() +" se inscribio con exito en el colegio " 
			+ colegio.getNombre() + " que queda en " + colegio.getDireccion()); 
			}else {
				System.out.println("En el colegio " +colegio.getNombre()+ " no quedan asientos disponibles en "
						+ "las aulas.");
			}
			
		}
	}
}
