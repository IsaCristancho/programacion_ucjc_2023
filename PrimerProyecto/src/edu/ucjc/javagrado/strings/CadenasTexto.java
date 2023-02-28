package edu.ucjc.javagrado.strings;

public class CadenasTexto {

	public static void main(String[] args) {
		String nombre = "Nombre1"; //se crea el objeto string, NO necesita poner el new
		//UN string es inmutable = quiere decir que no se puede cambiar su valor
		nombre = "Nombre2"; // esto no cambia su valor, lo que está haciendo es crear otro objeto con Nombre2
		
		nombre = nombre.toUpperCase(); // al hacer esto si apunta al objeto
		System.out.println(nombre);
		
		System.out.println(nombre.contains("bre")); //contains, revisa si en el objeto nombre hay o contiene un "bre".
		System.out.println(nombre.endsWith("2")); //revisa como termina el nombre
		System.out.println(nombre.indexOf("2")); //posicion donde se encuentra el caracter. (dame el indice del valor "2", devuelve 6)
		System.out.println(nombre.charAt(6)); //posicion donde se encuentra el valor. Es lo contrario a indexOf
		
		String valor = "asas.es.da.ese";
		System.out.println(valor.indexOf(".")); //te dice en que posición esta el primer punto que pille.
		System.out.println(valor.lastIndexOf(".")); //te dice en que posición esta el último punto.
		
		String valor2 = "    asas.es.   da.ese    ";
		System.out.println("'" +valor2.trim()+ "'"); //el trim elimina los espacios en blanco de la derecha y de la izquierda. Se usa en formularios.
		System.out.println("'" +valor2.replace(" ","")+ "'"); //aquí elimina todos los espacios en blanco
		
		System.out.println(valor2.substring(10)); // elimina todo lo que este antes de la posicion 10
		
		//Accedemos a la posicion +1 del ultimo punto
		int posicionUltimoPunto = valor2.lastIndexOf(".")+1; // el +1 para que no salga el 1
		//Obtenemos la subcadena
		String cadena = valor.substring(posicionUltimoPunto);
		//Eliminamos espacios en blanco
		System.out.println(cadena.trim());
		
		//esto es lo anterior pero en una línea
		//System.out.println(valor2.substring(valor.lastIndexOf(".")+1).trim());
		
		//Subcadena con punto de comienzo y punto final
		int posicionPrimerPunto = valor2.indexOf(".")+1;
		System.out.println(valor2.substring(posicionPrimerPunto, posicionUltimoPunto-1));
		System.out.println(cadena.replace(" ", ""));
		
		
		System.out.println("===================");
		String texto = "qwe;asdasd;asdsad;asdsad;asdsad";
		String [] valores = texto.split(",");
		System.out.println(texto.split(";")[1]); //separa donde haya un ;, y lo pone en un array, por eso pedimos la posicion 1
		System.out.println(valores[1]);
		
		for (String valorTexto : valores) {
			System.out.println(valorTexto);
		}
		
		//lenght = te dice la longitud del array, es decir, la longitud del string
		
		
		
		
		
	}

}
