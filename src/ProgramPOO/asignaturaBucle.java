package ProgramPOO;

import java.util.Scanner;

public class asignaturaBucle {

	public static void main(String[] args) {

		asignatura a1 = new asignatura();
		double nota = a1.getNota();
	
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce una nota");
		a1.leer(sc);
		while(a1.getNota() >= 0) {
			
			System.out.println(a1);
			System.out.println("Introduce datos de la asginatura");
			a1.leer(sc);
			
		}
		
		System.out.println("Fin del programa.");
		sc.close();
	}

}
