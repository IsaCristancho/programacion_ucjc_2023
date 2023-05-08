package edu.ucjc.javagrado.ejercicios.autos;

public class Motos extends Vehiculos{
	private int cilindrada;
	private int matricula;

	public Motos(String marca, String modelo, int anofabricacion, int cilindrada, int matricula) {
		super(marca, modelo, anofabricacion);
		this.cilindrada = cilindrada;
		this.matricula = matricula;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	@Override
	public void acelerar() {
		System.out.println("La moto con modelo" + this.getModelo() + "y matrícula "+this.matricula + "" );
	}

}
