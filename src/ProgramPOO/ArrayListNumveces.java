package ProgramPOO;

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListNumveces {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int num;
		ArrayList<Integer> arrayListInteger = new ArrayList<Integer>();
		
		for(int i = 0; i<5; i++) {
			arrayListInteger.add(0);
		}
		
		System.out.println("Introduce un numero del 1 al 5");
		num = sc.nextInt();
	
		while(num >= 1 && num <= 5) {

			
			
			Integer contenido = arrayListInteger.get(num -1);
			contenido++; 
			arrayListInteger.set(num-1, contenido);
			
			System.out.println("Introduce un numero del 1 al 5");
			num = sc.nextInt();
		}
	
			
			
			
		
			
		
		
		for (Integer i : arrayListInteger) {
			
			System.out.print(i + ",");

		}
	}

}
