package ProgramPOO;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListComplejoMenu {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		ArrayList<Complejo> arrayComplejo = new ArrayList<Complejo>();
		int opc;
		Complejo c = new Complejo();
		
		
	
		do {
			System.out.println("***MENU***");
			System.out.println("1-Añadir complejo");
			System.out.println("2-Buscar complejo");
			System.out.println("3-Borrar complejo");
			System.out.println("4-Listar complejo");
			System.out.println("5-Salir");
				
			opc = sc.nextInt();
			
			System.out.println();

			switch(opc) {
			case 1:
				
				System.out.println("***1-Añadir complejo***");
				System.out.println("Introduce un complejo");
				c.leer(sc);
				arrayComplejo.add(new Complejo(c));
				System.out.println("***Añadido con exito***");
			
				System.out.println();

				break;
			case 2:
			
				System.out.println("***2-Buscar complejo***");
				System.out.println("Introduce un complejo");
				c.leer(sc);
				int posicion = arrayComplejo.indexOf(c);
				if(posicion >=0) {
					System.out.println("El complejo " + c + " se encuentra en la posicion " + posicion );
				}else {
					System.out.println("El complejo no se encuentra en el array");

				}
				
				System.out.println();

				 break;
			case 3:

				System.out.println("***3-Borrar complejo***");
				System.out.println("Introduce un complejo");
				c.leer(sc);
				if(arrayComplejo.remove(c)) {
					System.out.println("El complejo " + c + " ha sido borrado");
				}else {
					System.out.println("El complejo " + c + "no se ha podido borrar");
				}
				
				System.out.println();

				
				break;
			case 4:

				System.out.println("***4-Listar complejo***");
				for(Complejo complejo:arrayComplejo) {
					System.out.print(complejo + ", ");
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
