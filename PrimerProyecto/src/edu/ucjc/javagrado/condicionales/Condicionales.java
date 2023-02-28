package edu.ucjc.javagrado.condicionales;

public class Condicionales {

	public static void main(String[] args) {
		
		//int num1 = 6, num2 = 8; (se puede hacer así, pero no se recomienda)
		int num1 = 9;
		int num2 = 8;
//		boolean condicion = num1<num2 || num1<0;  (Se puede poner así, y solo se colocaría dentro del if, en paréntesis, condicion.
		
		//if
		
//		if (num1>num2)  // Solo va a pintar el Hola, porque no hay llaves
//			System.out.println("Num1 es mayor que num2");
//			System.out.println("Hola");
//		
//		if (num1<num2) {
//			System.out.println("Num1 es mayor que num2");
//		}else if (num1<0) {
//			System.out.println("Num1 es menor que 0");
//		}else {
//			System.out.println("No se cumple ninguna condici[on");
//		}
//		if (num1<num2 || num1<0) // || esto es un OR, evalua una de las condiciones, SI SE CUMPLE LA PRIMERA, NO EVALUA LA SEGUNDA

//		if (num1<num2 | num1<0) // | esto es un OR, evalua las dos condiciones, si se cumple la primera, igualmente evalua la segunda
			
//		if (num1<num2 && num1<0) // && esto es una AND evalua las dos 
		
		//Switch
		String letra = "A";
		switch (letra) {
		case "A":System.out.println("El valor es A");
		case "E":System.out.println("El valor es E");
		case "I":System.out.println("El valor es I");
		case "O":System.out.println("El valor es O");
		case "U":System.out.println("El valor es U");
		default: System.out.println("Es una constante");  // esto es como un else, si se no se cumple ninguna vocal va a el default
		// este programa en principio imprime todo, porque en el String le estamos diciendo que comience por la A.
		// si se cambia el String a I, pues te imprime a partir de la I
		// si se pone un break ejemplo:
		  // case "A":System.out.println("El valor es A");break;
		// pararía en A, imprime solo la A.
		// Si se pone en el String una "I", y se pone el break en la I, pues solo imprime de la A a la I
		
		}
		
		
		
	}

}
