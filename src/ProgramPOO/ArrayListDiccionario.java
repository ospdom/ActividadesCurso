package ProgramPOO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDiccionario {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		ArrayList<String> arrayStrings = new ArrayList<String>();
		int opc;
		boolean salir = false;
		String s;
		
		
	
		do {
			System.out.println("***MENU***");
			System.out.println("1-Añadir palabra");
			System.out.println("2-Buscar palabra");
			System.out.println("3-Borrar palabra");
			System.out.println("4-Listar palabra");
			System.out.println("5-Salir");
				
			opc = sc.nextInt();
			
			System.out.println();

			switch(opc) {
			case 1:
				
				 sc.nextLine();
				System.out.println("***1-Añadir palabra***");
				System.out.println("Introduce una palabra");
				s = sc.nextLine();
				arrayStrings.add(s);
				System.out.println("***Añadido con exito***");
			
				System.out.println();

				break;
			case 2:
			
				 sc.nextLine();
				System.out.println("***2-Buscar palabra***");
				System.out.println("Introduce una palabra");
				s = sc.nextLine();
				int posicion = arrayStrings.indexOf(s);
				if(posicion >=0) {
					System.out.println("La palabra " + s + " se encuentra en la posicion " + posicion );
				}else {
					System.out.println("La palabra no se encuentra en el array");

				}
				
				System.out.println();

				 break;
			case 3:
				 sc.nextLine();

				System.out.println("***3-Borrar String***");
				System.out.println("Introduce una palabra");
				s = sc.nextLine();
				if(arrayStrings.remove(s)) {
					System.out.println("La palabra " + s + " ha sido borrado");
				}else {
					System.out.println("La palabra " + s + "no se ha podido borrar");
				}
				
				System.out.println();

				
				break;
			case 4:
				 sc.nextLine();

				System.out.println("***4-Listar palabra***");
				Collections.sort(arrayStrings);
				for(String st:arrayStrings) {
					System.out.print(st + ",");
				}
				
				System.out.println();
				System.out.println();


				break;
			case 5:
				System.out.println("Saliendo...");
				System.exit(0);
				
			
		}
		}while(opc != 5);
		


		
		
	}

}
