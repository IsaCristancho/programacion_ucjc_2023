package edu.ucjc.javagrado.bucles;

public class BucleWhile {

	public static void main(String[] args) {
		int num = 10;
		while (num<=10) {
			System.out.println(num++); //cambia el valor de num y luego lo pinta
			// si fuera (num++) Primero lo pinta y luego lo cambia
			System.out.println(num);
		}

		//Bucle do-while
		// Primero ejecuta y luego evalua
		do {
			System.out.println(num++);
		}while(num<=10);
		
	}

}
