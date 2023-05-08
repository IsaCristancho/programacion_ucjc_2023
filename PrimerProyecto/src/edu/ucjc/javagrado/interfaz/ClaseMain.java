package edu.ucjc.javagrado.interfaz;

public class ClaseMain {

	public static void main(String[] args) {
		Persona persona1 = new Persona("1A", "Isabella");
		Ordenador ordenador1 = new Ordenador("Dell","Inspiron 15");
		Empleado empleado = new Empleado("2B", "Juan", 1111, 20);
		
		ClaseMain cm = new ClaseMain();
		cm.insertarObjeto(persona1);
		
		System.out.println("===================");
		Insertable [] objects = {persona1, ordenador1, empleado};
		cm.insertarObjetos(objects);
		
	}

	private void insertarObjeto(Insertable object) {
		System.out.println("Insertando objeto insertable...");
		object.insert();
	}
	private void insertarObjetos(Insertable [] objects) {
		for (Insertable object : objects) {
			insertarObjeto(object);
		}
	}
}