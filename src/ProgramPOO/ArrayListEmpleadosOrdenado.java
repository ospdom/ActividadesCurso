package ProgramPOO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListEmpleadosOrdenado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		ArrayList<EmpleadoT7> arrayListEmpleado = new ArrayList<>();
		
		
		EmpleadoT7 e = new EmpleadoT7();
		
		char continuar;
		do {
			System.out.println("***Introduce un nuevo empleado***");
			e.leer(sc);
			arrayListEmpleado.add(new EmpleadoT7(e));
			sc.nextLine();
			System.out.println("Quieres continuar (s/n)");
			continuar = sc.nextLine().toLowerCase().charAt(0);
		}while(continuar == 's');
		
		Collections.sort(arrayListEmpleado);

		for(EmpleadoT7 em:arrayListEmpleado) {
			
			System.out.println(em);
		}
	}

}
