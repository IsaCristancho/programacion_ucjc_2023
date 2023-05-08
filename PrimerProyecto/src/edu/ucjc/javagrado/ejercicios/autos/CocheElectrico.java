package edu.ucjc.javagrado.ejercicios.autos;

public class CocheElectrico extends Coche{
	private int potenciaCarga;

	public CocheElectrico(String marca, String modelo, int anofabricacion, int numPuertas, String combustible,
			int matricula, int potenciaCarga) {
		super(marca, modelo, anofabricacion, numPuertas, combustible, matricula);
		this.potenciaCarga = potenciaCarga;
	}

	public int getPotenciaCarga() {
		return potenciaCarga;
	}

	public void setPotenciaCarga(int potenciaCarga) {
		this.potenciaCarga = potenciaCarga;
	}
	
	public void recargar() {
		System.out.println("El coche eléctrico con matrícula" + this.getMatricula()+ "está recargando");
	}

}
