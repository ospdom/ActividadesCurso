package Figura;

import java.util.ArrayList;

public class ArrayListFiguras {

	public static void main(String[] args) {
		
		ArrayList<figura> arraylistfiguras = new ArrayList<figura>();
				
		arraylistfiguras.add(new cuadrado(0,0,3));
		arraylistfiguras.add(new rectangulo(0,0,4,8));
		arraylistfiguras.add(new circulo(0,0,5));
		arraylistfiguras.add(new triangulo(0,0,4,7));
		
		for(figura f:arraylistfiguras) {
		
			System.out.println("El area del " + f.getClass().getSimpleName() + " es "+ f.area());
		}
	}

	

}
