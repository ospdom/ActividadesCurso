package ProgramPOO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

import pizzeria.Oferta;

public class ArrayListCadenasMenu {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		int opc;
		boolean salir = false;
		String s;
		
		 FileInputStream fis;
	        ObjectInputStream ois;
	        boolean modificado = false;
	        
	        try {
	            fis = new FileInputStream("cadenas.dat");
	            ois = new ObjectInputStream(fis);
	        

	            while (fis.available()>0) {
	                s = (String) ois.readObject();
	                arrayList.add(s);
	            }
	            ois.close();
	            fis.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        } 
		
		
	
		do {
			System.out.println("***MENU***");
			System.out.println("1-Añadir String");
			System.out.println("2-Buscar String");
			System.out.println("3-Borrar String");
			System.out.println("4-Listar String");
			System.out.println("5-Salir");
				
			opc = sc.nextInt();
			
			System.out.println();

			switch(opc) {
			case 1:
				
				 sc.nextLine();
				System.out.println("***1-Añadir String***");
				System.out.println("Introduce un string");
				s = sc.nextLine();
				arrayList.add(s);
				System.out.println("***Añadido con exito***");
				modificado = true;
			
				System.out.println();

				break;
			case 2:
			
				 sc.nextLine();
				System.out.println("***2-Buscar String***");
				System.out.println("Introduce un string");
				s = sc.nextLine();
				int posicion = arrayList.indexOf(s);
				if(posicion >=0) {
					System.out.println("El string " + s + " se encuentra en la posicion " + posicion );
				}else {
					System.out.println("El string no se encuentra en el array");

				}
				
				System.out.println();

				 break;
			case 3:
				 sc.nextLine();

				System.out.println("***3-Borrar String***");
				System.out.println("Introduce un string");
				s = sc.nextLine();
				if(arrayList.remove(s)) {
					System.out.println("El string " + s + " ha sido borrado");
				}else {
					System.out.println("El string " + s + "no se ha podido borrar");
				} modificado = true;
				
				System.out.println();

				
				break;
			case 4:
				 sc.nextLine();

				System.out.println("***4-Listar String***");
				for(String st:arrayList) {
					System.out.print(st + ",");
				}
				
				System.out.println();
				System.out.println();


				break;
			case 5:
				System.out.println("Saliendo...");
				System.exit(0);
				
			
		}
		}while(opc != 5);
		


		
		
	}

}
