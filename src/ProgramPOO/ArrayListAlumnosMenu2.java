package ProgramPOO;

import ProgramPOO.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListAlumnosMenu2 {

	public static void main(String[] args) {
		// creo arrayList
		ArrayList<Alumno> arrayList = new ArrayList<Alumno>();
		Alumno valor = new Alumno();
		int opcion;
		int posicion;
		// teclado
		Scanner teclado = new Scanner(System.in);
		
		// mientras que NO se introduzca la opcion 0
		// muestro menu
		do {
			System.out.println("1. A�adir");
			System.out.println("2. Buscar");
			System.out.println("3. Borrar");
			System.out.println("4. Listar");
			System.out.println("0. Salir");
			// leo opcion
			System.out.println("Opcion: ");
			opcion = teclado.nextInt();
			
				switch (opcion){
				case 1:
					// a�adir
					// leo valor
					teclado.nextLine();
					System.out.println("Alumno: ");
					valor.leer(teclado);
					if (!arrayList.contains(valor)){
						// si arrayList NO contiene todav�a valor 
						// creo una copia de ese objeto y la a�ado a arrayList
						arrayList.add(new Alumno(valor));
						// ordeno arrayList
						Collections.sort(arrayList);
					}
					break;
				case 2:
					// buscar
					// leo valor
					teclado.nextLine();
					System.out.println("Alumno: ");
					valor.leer(teclado);
					// la busco en arrayList
					posicion = arrayList.indexOf(valor);
					if(posicion >= 0){
						// si la encuentra Muestra un mensaje con la posici�n
						System.out.println("El elemento "+valor+ " se encuentra en la posicion "+posicion);
					}
					else{
						// si NO la encuentra muestra un mensaje de error
						System.out.println("El elemento "+valor+ " NO se encuentra en el arrayList");
					}
					break;
				case 3:
					// borrar
					// leo valor
					teclado.nextLine();
					System.out.println("Alumno: ");
					valor.leer(teclado);
					// la busco en arrayList
					if(arrayList.remove(valor)){
						// si la encuentra la borra
						System.out.println("El elemento "+valor+ " ha sido borrado");
					}
					else{
						// si NO la encuentra muestra un mensaje de error
						System.out.println("El elemento "+valor+ " NO se ha encontrado");
					}
					break;
				case 4:
					// listar
					// muestra el contenido del array por pantalla
					for (posicion=0; posicion < arrayList.size(); posicion++) {
						System.out.println(arrayList.get(posicion));
					}
				}
		}while(opcion != 0);
			
		// cierro teclado
		teclado.close();
	}
}
