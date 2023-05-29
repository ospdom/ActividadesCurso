package ProgramPOO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListCadenasOrdenado {

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
		
		Collections.sort(arrayListString);

		
		for(int i = 0; i<arrayListString.size(); i++) {
			System.out.print(arrayListString.get(i) + ",");
		}
		
	}

}
