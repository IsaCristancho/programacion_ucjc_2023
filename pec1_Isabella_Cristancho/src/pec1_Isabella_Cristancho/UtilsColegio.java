package pec1_Isabella_Cristancho;

import java.util.Scanner;

public class UtilsColegio {

	public static Profesor crearProfesor() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Indique el nombre del Profesor: ");
		String nombreProfesor = scan.nextLine();
		
		System.out.println("Indique los apellidos del Profesor: ");
		String apellidosProfesor = scan.nextLine();
		
		System.out.println("Indique el DNI del Profesor: ");
		String dniProfesor = scan.nextLine();
		
		System.out.println("Indique la asigantura que imparte el Profesor: ");
		String asingaturaProfesor = scan.nextLine();
		Profesor profesor = new Profesor(nombreProfesor, apellidosProfesor, dniProfesor, asingaturaProfesor);
		
		return profesor;
	}
	
	public static Alumno crearAlumno() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Indique el nombre del Alumno: ");
		String nombreAlumno = scan.nextLine();
		
		System.out.println("Indique los apellidos del Alumnor: ");
		String apellidosAlumno = scan.nextLine();
		
		System.out.println("Indique el DNI del Alumno: ");
		String dniAlumno = scan.nextLine();
		
		System.out.println("Indique la nota media del Alumno: ");
		int notaMedia = scan.nextInt();
		Alumno alumno = new Alumno(nombreAlumno, apellidosAlumno, dniAlumno, notaMedia);
		
		return alumno;
	}
	
}
