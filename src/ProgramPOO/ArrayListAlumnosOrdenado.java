package ProgramPOO;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAlumnosOrdenado {

	public static void main(String[] args) {
		
		ArrayList<Alumno> arraylistalumnos = new ArrayList<Alumno>();

		arraylistalumnos.add(new Alumno ("12", "Pedro", "Jimenez", new FechaT5 (4,6,2002), "1AW3"));
		arraylistalumnos.add(new Alumno ("9", "Agustin", "Gonzalez", new FechaT5 (4,12,2009), "1AW3"));
		arraylistalumnos.add(new Alumno ("8", "Luken", "Aguirre", new FechaT5 (4,1,2004), "1AW3"));
		arraylistalumnos.add(new Alumno ("7", "Petra", "Petra", new FechaT5 (4,6,1934), "1AW3"));
		
		Collections.sort(arraylistalumnos);   
		
		for(Alumno a:arraylistalumnos) {
			
			System.out.println(a);
		}

	}

}
