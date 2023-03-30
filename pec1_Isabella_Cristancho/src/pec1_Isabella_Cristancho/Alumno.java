package pec1_Isabella_Cristancho;

//Hereda de clase Persona 
public class Alumno extends Persona { 
	
	//Variables de instancia
	private int notaMedia;

	//Constructor 
	public Alumno(String nombre, String apellidos, String dni, int notaMedia) {
		super(nombre, apellidos, dni);
		this.notaMedia = notaMedia;
	}

	//Metodo Get y Set
	public int getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(int notaMedia) {
		this.notaMedia = notaMedia;
	}
}