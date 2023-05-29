package ProgramPOO;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMediaTemperaturas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double temperatura, suma = 0, media = 0;
		int menor = 0, mayor = 0, iguales = 0;
		ArrayList<Double>arrayListDouble = new ArrayList<Double>();
		
		
		System.out.println("Introduce una temperadura");
		temperatura = sc.nextDouble();
		
		while(temperatura > -999) {
			
			arrayListDouble.add(temperatura);
			
			System.out.println("Introduce una temperadura");
			temperatura = sc.nextDouble();
		}
		
		for (Double temp : arrayListDouble) {
			
			 suma += temp;
			 
			 media = suma/arrayListDouble.size();
			 
			
		}
		

		for (Double temp : arrayListDouble) {
			
			 if(temp < media) {
				 menor++;
			 }else if(temp > media) {
				 mayor++;
			 }else {
				 iguales++;
			 }
			
		}
		
		 
		 
		 
		 
		 System.out.println("La temperatura media es " + media);
		 System.out.println(mayor + " temperaturas son mayores a la media");
		 System.out.println(menor + " temperaturas son menores a la media");
		 System.out.println(iguales + " temperaturas son iguales a la media");
		
	}

	

}
