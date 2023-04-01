package edu.ucj.programacion.pec1.Isabella_Cristancho;

public class Aula {
	
	//Variables de instancia
	private int numeroClase;
	private int planta;
	private Profesor profesor; // Se pasa profesor como un objeto
	private Alumno [] asientos = new Alumno [3]; //Array de alumnos 
	private int freeSeatsIndex; //Variable que va a guardar el numero disponible de asientos
	
	//Constructor
	public Aula(int numeroClase, int planta, Profesor profesor, Alumno[] asientos) {
		super();
		this.numeroClase = numeroClase;
		this.planta = planta;
		this.profesor = profesor;
		asientos = new Alumno [3]; // Se establece el tamaño del array
		this.freeSeatsIndex = 0; //Indice del primer asiento vacio
		//ya que las posiciones del array son 0,1,2 porque es de 3
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

	/* Nuevo metodo AsignarAlumno
	 * 
	 * Este metodo lo que va a hacer es asignarle un puesto al alumno de la siguiente manera:
	 * 
	 * - Se le va a pasar de parametro un alumno.
	 * - Al principio el array de asientos esta vacio porque no hay ningun alumno, 
	 * por eso declaramos la variable freeSeatsIndex a 0 (que es la primera posicion del array), 
	 * y asi, el primer alumno ocupara la primera posicion del array.
	 * - Cuando asigne al alumno al array, se le va a sumar 1 a la variable freeSeatsIndex,
	 * para que a la proxima vez que entre en el bucle, lo asigne a la posicion 2 (que sera la 1) y 
	 * asi llenar el array de longitud 3.
	 * - Devolvera un 1, si se asigno a un alumno, si no pudo asignarlo (porque ya esta lleno)
	 * devolvera un 0
	 *  
	 */
	
	
	// Asignar alumno, el primer asiento libre que se tiene
	public int asignarAlumno(Alumno alumno) {
		int i = this.getFreeSeatsIndex(); // La i toma el valor de freeSeatsIndex.
		if (i<3) { // i menor que 3 porque asi me aseguro que no vaya a pasar la longitud del array, 
			//ya que va de 0,1,2 (porque la longitud es de 3). Por ende, nunca va a ser mayor de 3.
			this.asientos[i] = alumno; // Se agrega el alumno a la posicion i del array asientos.
			this.freeSeatsIndex += 1; // Se le suma 1, para que a la proxima pase a la siguiente 
			//posicion del array.  
			return 1; // Agrego a un alumno.
		}
		else {
			return 0; // No agrego a un alumno porque estaba ocupado
		}
	}
}
