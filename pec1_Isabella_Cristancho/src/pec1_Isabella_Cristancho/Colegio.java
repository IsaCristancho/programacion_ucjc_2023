package pec1_Isabella_Cristancho;

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
	
	public void asignSeat (Aula [] aulas, Alumno alumnos) {
		for (Aula aula : aulas) {
			for (Aula asientos : aula.getAsientos()) {
				for (i=0 ; i < asientos.lenght ; i++) {
					
				}
				
			}
			
		}
	}
}
