package edu.ucjc.javagrado.ejercicios.autos;

public class Vehiculos {
	private String marca;
	private String modelo;
	private int anofabricacion;
	
	public Vehiculos(String marca, String modelo, int anofabricacion) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anofabricacion = anofabricacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnofabricacion() {
		return anofabricacion;
	}

	public void setAnofabricacion(int anofabricacion) {
		this.anofabricacion = anofabricacion;
	}
	
	public void acelerar() {
		System.out.println(this.modelo + "está acelerando");
	}
	
	public void frenar() {
		System.out.println(this.modelo + "está frenando");
	}

}
