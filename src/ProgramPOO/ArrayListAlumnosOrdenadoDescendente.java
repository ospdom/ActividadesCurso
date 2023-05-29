package ProgramPOO;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAlumnosOrdenadoDescendente {

	public static void main(String[] args) {
		ArrayList<Alumno> arraylistalumnos = new ArrayList<Alumno>();

		arraylistalumnos.add(new Alumno ("5837F", "Pedro", "Jimenez", new FechaT5 (4,6,2002), "1AW3"));
		arraylistalumnos.add(new Alumno ("59389E", "Agustin", "Gonzalez", new FechaT5 (4,12,2009), "1AW3"));
		arraylistalumnos.add(new Alumno ("8985Q", "Luken", "Aguirre", new FechaT5 (4,1,2004), "1AW3"));
		arraylistalumnos.add(new Alumno ("12345L", "Petra", "Petra", new FechaT5(4,6,1934), "1AW3"));
		
		Collections.sort(arraylistalumnos, Collections.reverseOrder());   
		
		for(Alumno a:arraylistalumnos) {
			
			System.out.println(a);
		}
	}

}
