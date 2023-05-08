package edu.ucjc.javagrado.interfaz;

public class Empleado extends Persona implements Empleable{

	private long id;
	private int antiguedad;
	
	public Empleado(String nombre, String dni, long id, int antiguedad) {
		super(nombre, dni);
		this.id = id;
		this.antiguedad = antiguedad;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	@Override
	public void insert() {
		System.out.println("Insertando empleado...");
	}
	@Override
	public void fichar() {
		System.out.println("Fichando empleado con id: "+id);
	}
}