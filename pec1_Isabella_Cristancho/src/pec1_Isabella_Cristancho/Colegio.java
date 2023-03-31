package pec1_Isabella_Cristancho;

import java.util.ArrayList;
import java.util.List;

public class Colegio {

	// Variables de instancia
	private String nombre;
	private String direccion;
	private Aula[] aulas; // Array de aulas
	

	// Constructor
	public Colegio(String nombre, String direccion, Aula[] aulas, int numAulas) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		aulas = new Aula[numAulas];
	}


	public Colegio() {
		super();
		this.nombre = "";
		this.direccion = "";
		List<Aula> aulas = new ArrayList<>(); //crear un arreglo de aula que no tiene dimensiones
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public Aula[] getAulas() {
		return aulas;
	}


	public void setAulas(Aula[] aulas) {
		this.aulas = aulas;
	}
	
	//Buscar el 1, lo asigna
	public boolean asignSeat (Alumno alumno) {//Boolean porque va a retornar un true y un false
		Aula[] aulas = this.getAulas();
				
		for (Aula aula : aulas) {
			if (aula.asignarAlumno(alumno) == 1) {
				System.out.println(); //el alumno concatenar dni
				return true; //El return true interrumpe el for cuando consegui la primera libre
			} 
			else {
				System.out.println(); //en el aula tal no hay asientos disponibles en TAL aula, para que luego recorra la otra aula
			}	
		}
		System.out.println(); //No hay aulaS disponibles  
		return false;
	}
}
