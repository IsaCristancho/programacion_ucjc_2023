package edu.ucjc.javagrado.bucles;

public class BucleFor {

	public static void main(String[] args) {
		
		for (int i=0; i<10; i+=2) {
			//inicializacion ; condicion; y le suma el valor a i cada vez que vuelva a entrar al bucle 
				if (i%2==0 && i<8) {
					continue;
				}else if (i%3==0) {
					break;
				}
				System.out.println("FIN");
				
				//Bucle foreach
				
			}
		}
}

