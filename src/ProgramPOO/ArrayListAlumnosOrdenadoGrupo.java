package ProgramPOO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListAlumnosOrdenadoGrupo {

	public static void main(String[] args) {

		ArrayList<Alumno> arraylistalumnos = new ArrayList<Alumno>();

		arraylistalumnos.add(new Alumno ("5837F", "Pedro", "Jimenez", new FechaT5 (4,6,2002), "4FE"));
		arraylistalumnos.add(new Alumno ("12", "Agustin", "Gonzalez", new FechaT5 (4,12,2009), "1AW3"));
		arraylistalumnos.add(new Alumno ("13", "Luken", "Aguirre", new FechaT5 (4,1,2004), "1AW3"));
		arraylistalumnos.add(new Alumno ("12345L", "Petra", "Petra", new FechaT5 (4,6,1934), "56E"));
		
		Collections.sort(arraylistalumnos, new Comparator<Alumno>() {
			@Override
			public int compare(Alumno a1, Alumno a2) {
				
				int comparacion = 0;
				if(a1.getGrupo().compareTo(a2.getGrupo()) == 0 ) {
					
					 comparacion = a1.compareTo(a2);
				}
					return comparacion;
				

			}
			
			

			
		});
		
		for(Alumno a:arraylistalumnos) {
			
			System.out.println(a);
		}
	}

}
