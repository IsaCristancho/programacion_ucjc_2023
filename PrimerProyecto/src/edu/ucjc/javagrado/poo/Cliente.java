package edu.ucjc.javagrado.poo;

public class Cliente {
	//Atributos o variables de instancia
	
	// private String nombre; "Modificador de acceso private: restringe el aceso a una variable"
	String nombre;
	String apellidos;
	String dni;
	int edad;
	
	//Constructor
	
	//Métodos
	public void comprar() {
		System.out.println("Cliente"+nombre+"esta comprando");
		//Variable local
		String test; //La tenemos que inicializar nosotros
		System.out.println(apellidos);
		test = "Hola";
		System.out.println(test);
}

}
