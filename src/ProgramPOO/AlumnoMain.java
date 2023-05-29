package ProgramPOO;

import java.util.Scanner;
public class AlumnoMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		Alumno a1 = new Alumno();
		
		
		
		Alumno a3 = new Alumno("dni", "n", "a" , new FechaT5(), "1AW3");
		System.out.println(a3);
		
		a3.setDni("5555");
		System.out.println(a3);
		
		Alumno a2 = new Alumno(a1);
		if(a3.equals(a2)) {
			System.out.println(a3 + " es igual que " + a2);
		}else {
			System.out.println(a3 + " no es igual que " + a2);
		}
		
		Alumno a4 = new Alumno(new PersonaT5("450235" , "Bittor", "Gonzalez", new FechaT5(5, 10,2022)), "1AW3");
		System.out.println(a4);
		
		if(a3.compareTo(a4) < 0) {
			System.out.println(a3 + " es mayor que " + a4);
		}else if(a3.compareTo(a4) == 0) {
			System.out.println(a3 + " es igual a " + a4);

		}else if(a3.compareTo(a4) > 0) {
			System.out.println(a3 + " es menor que " + a4);
		}
		
		a1.leer(sc);
	}

}
