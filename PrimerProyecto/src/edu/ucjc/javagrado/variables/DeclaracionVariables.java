package edu.ucjc.javagrado.variables; //Esta línea siempre va 

public class DeclaracionVariables {
	//Variable de instancia o clase (se inicializan sola, java les da un valor)
	static int numero4;
	/**
	 * Comentarios de Javadoc
	 * @param args
	 */
	public static void main(String[] args) {
		//Comentario de línea
		
		/*
		 *Comentario 
		 *de 
		 *bloque
		 * 
		 * ctrl + shift + C = comentar todo lo que sombreaste
		 * 
		 */
		
		//Tipo de datos
		int numero = 12;
		double numeroDecimal = 7.5; // double es para decimal, float tambien se usa pero tienes que colocar una f al final = 7,5f
		boolean isMayorEdad = true; // Aquí true y false se escriben en minúscula
		String nombre = "Isabella Cristancho"; // El String va en mayúscula y se escribe completo
		//Arrays = es como una lista (diferenecia con el int de la línea 21, es que esta guarda más números (una lista))
		int [] numeros = {1,2,3,4};
		
		System.out.println("Hola " + numero + 9); //Aquí no hace la suma de 12 más 9, porque estas concatenando Hola + 12 + 9, entonces sale Hola 129
		System.out.println("Suma: "+ (numero +9)); //Con los paréntesis se suman las cosas. 
		
		String numero2 = "24";
		//int resultado = numero + numero2; //Aquí da error porque no puedes sumar un string con un int
		int resultados = numero + Integer.parseInt(numero2);  //Con esto pasas el String a int, y aquí si se resuelve la suma. Integer es para pasar a número entero
		System.out.println(resultados);
		
		double numero3 = Double.parseDouble(numero2);
		System.out.println(numero3);
		
		int num;//Declaración  (es decir el tipo de la variable y el nombre de la variable)
		System.out.println("numero " + numero4);
		num = 8;//Inicialización   (darle un valor a la variable)
		num = 9;
		
		
		//println = te pasa el cursor y todo a la línea de abajo
		//print = te lo mantiene todo en la misma línea
		
	}

}
