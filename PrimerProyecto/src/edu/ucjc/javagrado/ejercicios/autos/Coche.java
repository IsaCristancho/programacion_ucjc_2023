package edu.ucjc.javagrado.ejercicios.autos;

public class Coche extends Vehiculos{
	private int numPuertas;
	private String combustible;
	private int matricula;
	
	public Coche(String marca, String modelo, int anofabricacion, int numPuertas, String combustible, int matricula) {
		super(marca, modelo, anofabricacion);
		this.numPuertas = numPuertas;
		this.combustible = combustible;
		this.matricula = matricula;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	@Override
	public void acelerar() {
		System.out.println("El coche con matrícula" + this.matricula + "está arrancando");
	}

	@Override
	public void frenar() {
		System.out.println("El coche con matrícula" + this.matricula + "está frenando");
	}
}
