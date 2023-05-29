package ProgramPOO;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCadenasForeach {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String cadena;
		ArrayList<String> arrayListString = new ArrayList<String>();
		

		System.out.println("Introduce una cadena");
		cadena = sc.nextLine();
		
		while(!cadena.isEmpty()) {
			arrayListString.add(cadena);
			
			System.out.println("Introduce una cadena");
			cadena = sc.nextLine();
			
		}
		
		for (String cadena2 : arrayListString) {
			
			System.out.print(cadena2 + ",");

		}

		
	}

}
