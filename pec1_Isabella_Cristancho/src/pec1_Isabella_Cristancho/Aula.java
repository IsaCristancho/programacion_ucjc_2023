package pec1_Isabella_Cristancho;

public class Aula {
	
	//Variables de instancia
	private int numeroClase;
	private int planta;
	private Profesor profesor; // Se pasa profesor como un objeto
	private Alumno [] asientos = new Alumno [3]; //Array de alumnos 
	private int freeSeatsIndex;
	
	//Constructor
	public Aula(int numeroClase, int planta, Profesor profesor, Alumno[] asientos) {
		super();
		this.numeroClase = numeroClase;
		this.planta = planta;
		this.profesor = profesor;
		asientos = new Alumno [3]; // Se establece el tamaño del array
		this.freeSeatsIndex = 0; //Indice del primer asiento vacio
	}

	//Metodo Get y Set
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
	
	public int getFreeSeatsIndex() {
		return freeSeatsIndex;
	}

	public void setFreeSeatsIndex(int freeSeatsIndex) {
		this.freeSeatsIndex = freeSeatsIndex;
	}

	// Asignar alumno, el primer asiento libre que se tiene
	public int asignarAlumno(Alumno alumno) {
		int i = this.getFreeSeatsIndex();
		if (i<3) {
			this.asientos[i] = alumno;
			this.freeSeatsIndex += 1;
			return 1; //Agrego a un alumno
		}
		else {
			return 0; // No agrego a un alumno porque estaba ocupado
		}
	}
}
