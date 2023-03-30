package pec1_Isabella_Cristancho;

public class Aula {
	
	//Variables de instancia
	private int numeroClase;
	private int planta;
	private Profesor profesor; // Se pasa profesor como un objeto
	private Alumno [] asientos; //Array de alumnos 
	
	//Constructor
	public Aula(int numeroClase, int planta, Profesor profesor, Alumno[] asientos) {
		super();
		this.numeroClase = numeroClase;
		this.planta = planta;
		this.profesor = profesor;
		asientos = new Alumno [3]; // Se establece el tamaño del array
	}

	//Metdodo Get y Set
	public int getNumeroClase() {
		return numeroClase;
	}

	public void setNumeroClase(int numeroClase) {
		this.numeroClase = numeroClase;
	}

	public int getPlanta() {
		return planta;
	}

	public void setPlanta(int planta) {
		this.planta = planta;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Alumno[] getAsientos() {
		return asientos;
	}

	public void setAsientos(Alumno[] asientos) {
		this.asientos = asientos;
	}
	
	
	
	
	
	
	
	

}
