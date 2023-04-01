package edu.ucj.programacion.pec1.Isabella_Cristancho;

//Hereda de clase Persona 
public class Alumno extends Persona { 
	
	//Variables de instancia
	private float notaMedia;

	//Constructor 
	public Alumno(String nombre, String apellidos, String dni, float notaMedia) {
		super(nombre, apellidos, dni);
		this.notaMedia = notaMedia;
	}

	//Metodo Get y Set del atributo especial de Alumno
	public float getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(float notaMedia) {
		this.notaMedia = notaMedia;
	}
}
