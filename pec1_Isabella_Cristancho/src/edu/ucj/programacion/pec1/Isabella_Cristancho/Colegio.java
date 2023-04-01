package edu.ucj.programacion.pec1.Isabella_Cristancho;

// Se importa la clase ArrayList para poder usarla 
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

	// Sobre escribiendo el Constructor, al default
	public Colegio() {
		super();
		this.nombre = "";
		this.direccion = "";
		List<Aula> aulas = new ArrayList<>(); // He puesto esto para poder crear un arreglo de aula 
		// que no tiene dimensiones, ya que es dinamico, he buscado como solucionar ese error en Google y pues funciona.
	}


	// Metodo Get y Set
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
	
	/*  Este metodo va a asignar el asiento en cada Aula
	 *  Busca el 1 del metodo asignarAlumno, y si hay un 1 pues lo asigna y retorna true
	 *  Si no hay 1, retorna al bucle y lo ejecuta para la siguiente aula
	 *  Si hay mas alumnos pero ya recorrio todas las aulas, retorna false y eso para el bucle
	 * 
	 */
	
	public boolean asignSeat (Alumno alumno) {// Boolean porque va a retornar un true y un false
		Aula[] aulas = this.getAulas(); // Aqui se pide el numero de Aulas que metio el usuario
				
		for (Aula aula : aulas) { // Este bucle for each recorre las aulas.
			if (aula.asignarAlumno(alumno) == 1) { // Llama al metodo asignarAlumno, y si se asigno a un alumno 
				//exitosamente
				System.out.println(alumno.getNombre() + " " + alumno.getApellidos() +  " con DNI " +alumno.getDni() 
				+", se asignó en el asiento "+ aula.getFreeSeatsIndex()+ " del aula " + aula.getNumeroClase());
				return true; //El return true interrumpe el for cuando consegui la primera libre
			} 
			else {
				System.out.println("En el aula " + aula.getNumeroClase() + " no hay asientos disponibles para " 
			+ alumno.getNombre()+ " " + alumno.getApellidos()+ "con DNI " + alumno.getDni()); 
				//Luego recorre la otra aula
			}	
		}
		System.out.println("No hay aulas disponibles en el colegio " + this.nombre); //No hay aulas disponibles  
		return false;
	}
}
