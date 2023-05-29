package ProgramPOO;

import java.util.Scanner;

public class complejoMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Complejo [] array = new Complejo[10];
		int contador = 0;
		
		Complejo c1 = new Complejo();
		System.out.println("Introduce un numero complejo");
		c1.leer(sc);
		while(contador < 10 || c1.getImaginaria() >= 0 && c1.getReal() >= 0) {
			
			System.out.println(c1);
			
			System.out.println("Introduce los datos para un numero complejo");
			c1.leer(sc);
			
			contador++;
		}
	}

}
