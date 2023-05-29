package ProgramPOO;

import java.util.Scanner;

public class asignaturaMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		asignatura a1 = new asignatura();
		System.out.println(a1);
		
		asignatura a2 = new asignatura(a1);
		System.out.println(a2);
		
		
		asignatura a3 = new asignatura ("ED", "Entornos de desarrollo", 1.0);
		System.out.println(a3);
		
		if (a1.equals(a2)) {
			System.out.println(a1 + " y " + a2 + " son iguales");
		}else {
			System.out.println(a1 + " y " + a2 + " NO son iguales");
		}
		
		a2.setCodigo("ED");
		if(a2.compareTo(a3) >0) {
			System.out.println(a2 + " es menor que " + a3);
		}else if(a2.compareTo(a3) < 0) {
			System.out.println(a2 + " es menor que " + a3);
		}else {
			System.out.println(a2 + " y " + a3 + " son iguales");
		}
		
		a2.leer(sc);
		
		System.out.println(a2);
		sc.close();
	}

}
