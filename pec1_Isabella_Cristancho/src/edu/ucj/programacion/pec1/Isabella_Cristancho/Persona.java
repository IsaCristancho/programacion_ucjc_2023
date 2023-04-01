package edu.ucj.programacion.pec1.Isabella_Cristancho;

//Creo una clase llamada Persona que va a hacer una Clase Padre.
//Ya que Alumno y Profesor compraten atributos (nombre, apellidos y DNI)
//Por lo tanto, la clase Alumno y Profesor van a ser sus clases hijas.


//Clase Padre 
public class Persona {
	
	//Variables de instancia
	private String nombre;
	private String apellidos;
	private String dni;
	
	//Constructor
	public Persona(String nombre, String apellidos, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}

	//Metodo Get y Set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	
	
	

}
