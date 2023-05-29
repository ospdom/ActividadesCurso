package ProgramPOO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayCadenasIterator {

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
		
		Iterator<String> it = arrayListString.iterator();

		while(it.hasNext()) {
			  System.out.print(it.next() + ",");
		}
			
		
	}

}