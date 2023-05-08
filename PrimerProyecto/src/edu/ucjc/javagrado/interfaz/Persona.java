package edu.ucjc.javagrado.interfaz;

public class Persona implements Insertable{
	
	private String nombre;
	private String dni;
	
	public Persona(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	@Override
	public void insert() {
		System.out.println("Insertando persona...");
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + "]";
	}
}