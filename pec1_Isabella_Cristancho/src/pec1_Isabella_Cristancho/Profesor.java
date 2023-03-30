package pec1_Isabella_Cristancho;

//Hereda de clase Persona
public class Profesor extends Persona{
	
	//Variables de instancia
	private String asignatura;

	//Constructor 
	public Profesor(String nombre, String apellidos, String dni, String asignatura) {
		super(nombre, apellidos, dni);
		this.asignatura = asignatura;
	}
	
	//Metodo Get y Set
	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
}
