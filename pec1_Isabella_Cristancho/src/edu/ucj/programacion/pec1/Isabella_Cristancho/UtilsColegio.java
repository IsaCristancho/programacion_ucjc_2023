package edu.ucj.programacion.pec1.Isabella_Cristancho;

import java.util.Scanner;

public class UtilsColegio {
	
	// Metodo para crear al profesor por el usuario

	public static Profesor crearProfesor() {
		
		// Se pide el nombre del profesor y se guarda
		Scanner scan = new Scanner(System.in);
		System.out.print("Indique el nombre del Profesor: ");
		String nombreProfesor = scan.nextLine();
		
		// Se pide el apellido del profesor y se guarda 
		System.out.print("Indique los apellidos del Profesor: ");
		String apellidosProfesor = scan.nextLine();
		
		// Se pide el DNI del profesor y se guarda
		System.out.print("Indique el DNI del Profesor: ");
		String dniProfesor = scan.nextLine();
		
		// Se pide la asignatura y se guarda
		System.out.print("Indique la asignatura que imparte el Profesor: ");
		String asingaturaProfesor = scan.nextLine();
		Profesor profesor = new Profesor(nombreProfesor, apellidosProfesor, dniProfesor, asingaturaProfesor);
		// Llama al unico constructor del profesor, en la clase Profesor
		
		return profesor; // Devuelve al profesor 
	}
	
	// Metodo para crear al alumno 
	
	public static Alumno crearAlumno() {
		
		// Se pide el nombre del alumno y se guarda
		Scanner scan = new Scanner(System.in);
		System.out.print("Indique el nombre del Alumno: ");
		String nombreAlumno = scan.nextLine();
		
		// Se pide el apellido del alumno y se guarda
		System.out.print("Indique los apellidos del Alumno: ");
		String apellidosAlumno = scan.nextLine();
		
		// Se pide el DNI del alumno y se guarda
		System.out.print("Indique el DNI del Alumno: ");
		String dniAlumno = scan.nextLine();
		
		// Se pide la nota media del alumno y se guarda
		System.out.print("Indique la nota media del Alumno: ");
		Float notaMedia = scan.nextFloat();
		notaMedia = Float.valueOf(scan.nextLine());
		Alumno alumno = new Alumno(nombreAlumno, apellidosAlumno, dniAlumno, notaMedia);
		// Llama al unico constructor de alumno en la clase Alumno
		
		return alumno; // Devuelve al alumno
	}
}
