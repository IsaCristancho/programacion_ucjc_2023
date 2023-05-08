package edu.ucjc.javagrado.ejercicios.maniquis;

public class Ropa {
	
	private String color;
	private int talla;
	private int precio;
	
	public Ropa(String color, int talla, int precio) {
		super();
		this.color = color;
		this.talla = talla;
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getTalla() {
		return talla;
	}

	public void setTalla(int talla) {
		this.talla = talla;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
}
