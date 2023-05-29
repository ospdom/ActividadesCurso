package ProgramPOO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListEmpleadosMenu {

	public static void main(String[] args) {
		ArrayList<EmpleadoT7> arrayList = new ArrayList<EmpleadoT7>();
		EmpleadoT7 valor = new EmpleadoT7();
		int opcion;
		int posicion;
		Scanner sc = new Scanner(System.in);
		
	
		do {
			System.out.println("1. A�adir");
			System.out.println("2. Buscar");
			System.out.println("3. Borrar");
			System.out.println("4. Listar");
			System.out.println("0. Salir");
			System.out.println("Opcion: ");
			opcion = sc.nextInt();
			
				switch (opcion){
				case 1:
					sc.nextLine();
					System.out.println("Empleado: ");
					valor.leer(sc);
					if (!arrayList.contains(valor)){
					
						arrayList.add(new EmpleadoT7(valor));
						Collections.sort(arrayList);
					}
					break;
				case 2:
					
					sc.nextLine();
					System.out.println("Empleado: ");
					valor.leer(sc);
					
					posicion = arrayList.indexOf(valor);
					if(posicion >= 0){
						
						System.out.println("El elemento "+valor+ " se encuentra en la posicion "+posicion);
					}
					else{
						
						System.out.println("El elemento "+valor+ " NO se encuentra en el arrayList");
					}
					break;
				case 3:
					
					sc.nextLine();
					System.out.println("Empleado: ");
					valor.leer(sc);
					
					if(arrayList.remove(valor)){
						System.out.println("El elemento "+valor+ " ha sido borrado");
					}
					else{
						System.out.println("El elemento "+valor+ " NO se ha encontrado");
					}
					break;
				case 4:
					Collections.sort(arrayList);
					for (posicion=0; posicion < arrayList.size(); posicion++) {
						System.out.println(arrayList.get(posicion));
						break;
				
					}
					
				case 5:
					Collections.sort(arrayList, new Comparator<EmpleadoT7>() {
						
						

						@Override
						public int compare(EmpleadoT7 e1, EmpleadoT7 e2) {
							
							int comparacion;
							Double s1 = e1.getSalario();
							Double s2 = e2.getSalario();
							comparacion = s1.compareTo(s2);
							if(comparacion == 0) {
								comparacion = e1.compareTo(e2);
							}
							
							return comparacion;
						}
					});
				}
		}while(opcion != 0);
			
		sc.close();
	}
}
