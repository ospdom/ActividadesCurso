package ProgramPOO;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMedia {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int entero;
		double suma = 0;
		ArrayList<Integer> arrayListInteger = new ArrayList<Integer>();
		

		System.out.println("Introduce un entero");
		entero = sc.nextInt();
		
		while(entero > 0) {
			
			arrayListInteger.add(entero);
			
			System.out.println("Introduce una cadena");
			entero = sc.nextInt();
			
		}
		
		for (Integer entero2 : arrayListInteger) {
			
			 suma += entero2;
		
		}
		double media = suma/arrayListInteger.size();
		
		System.out.println("La media de los numeros introducidos es " + media);
		
	}

}
