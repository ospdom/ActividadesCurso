package ProgramPOO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListEmpleadosOrdenadoSalario {

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
		
	
				
		Collections.sort(arrayListEmpleado, new Comparator<EmpleadoT7>() {
			
		

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
/*
			@Override
			public int compare(empleado o1, empleado o2) {
				// TODO Auto-generated method stub
				return 0;
			}*/
		});
				
		for(EmpleadoT7 em:arrayListEmpleado) {
			
			System.out.println(em);
		}
	}

}
