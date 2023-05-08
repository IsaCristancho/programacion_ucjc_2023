package edu.ucjc.javagrado.colecciones;

import java.util.List;

public class CocheF1 {
	
	private int numero; 
	private String nombrePiloto;
	private String escuderia;
	private List<String> patrocinadores;
	private int velMaxima;
	
	public CocheF1(int numero, String nombrePiloto, String escuderia, List<String> patrocinadores, int velMaxima) {
		super();
		this.numero = numero;
		this.nombrePiloto = nombrePiloto;
		this.escuderia = escuderia;
		this.patrocinadores = patrocinadores;
		this.velMaxima = velMaxima;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNombrePiloto() {
		return nombrePiloto;
	}

	public void setNombrePiloto(String nombrePiloto) {
		this.nombrePiloto = nombrePiloto;
	}

	public String getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}

	public List<String> getPatrocinadores() {
		return patrocinadores;
	}

	public void setPatrocinadores(List<String> patrocinadores) {
		this.patrocinadores = patrocinadores;
	}

	public int getVelMaxima() {
		return velMaxima;
	}

	public void setVelMaxima(int velMaxima) {
		this.velMaxima = velMaxima;
	}
	
	public void correr() {
		System.out.println("El coche "+this.numero+" esta corriedo a "+this.velMaxima*Math.random()+" Km por hora.");
	}

	@Override
	public String toString() {
		return "CocheF1 [numero=" + numero + ", nombrePiloto=" + nombrePiloto + ", escuderia=" + escuderia
				+ ", patrocinadores=" + patrocinadores + ", velMaxima=" + velMaxima + "]";
	}
	

}
