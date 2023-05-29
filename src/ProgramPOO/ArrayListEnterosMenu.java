package ProgramPOO;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEnterosMenu {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		ArrayList<Integer> arrayenteros = new ArrayList<Integer>();
		int opc;
		boolean salir = false;
		Integer s;
		
		
	
		do {
			System.out.println("***MENU***");
			System.out.println("1-Añadir entero");
			System.out.println("2-Buscar entero");
			System.out.println("3-Borrar entero");
			System.out.println("4-Listar entero");
			System.out.println("5-Salir");
				
			opc = sc.nextInt();
			
			System.out.println();

			switch(opc) {
			case 1:
				
				System.out.println("***1-Añadir entero***");
				System.out.println("Introduce un entero");
				s = sc.nextInt();
				arrayenteros.add(s);
				System.out.println("***Añadido con exito***");
			
				System.out.println();

				break;
			case 2:
			
				System.out.println("***2-Buscar entero***");
				System.out.println("Introduce un entero");
				s = sc.nextInt();
				int posicion = arrayenteros.indexOf(s);
				if(posicion >=0) {
					System.out.println("El entero " + s + " se encuentra en la posicion " + posicion );
				}else {
					System.out.println("El entero no se encuentra en el array");

				}
				
				System.out.println();

				 break;
			case 3:
			

				System.out.println("***3-Borrar entero***");
				System.out.println("Introduce un entero");
				s = sc.nextInt();
				
				if(arrayenteros.remove(s) ) {
					System.out.println("El entero " + s + " ha sido borrado");
				}else {
					System.out.println("El entero " + s + "no se ha podido borrar");
				}
				
				System.out.println();

				
				break;
			case 4:
			

				System.out.println("***4-Listar entero***");
				for(Integer entero :arrayenteros) {
					System.out.print(entero + ",");
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
