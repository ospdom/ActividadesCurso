package ProgramPOO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCadenasMenuSerializable implements Serializable{
   

	public static void main(String[] args) {
    	
        ArrayList<String> ArrayList = new ArrayList<String>();
        
        Scanner teclado = new Scanner(System.in);
        int opcion;
        String c;
        
        FileInputStream fis;
        ObjectInputStream ois;
        boolean modificado = false;
        
        try {
            fis = new FileInputStream("cadenas.dat");
            ois = new ObjectInputStream(fis);
        

            while (fis.available()>0) {
                c = (String) ois.readObject();
                ArrayList.add(c);
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
        System.out.println("Elige una de las siguientes opciones");
        System.out.println("1- Añadir");
        System.out.println("2- Buscar");
        System.out.println("3- Borrar");
        System.out.println("4- Listar Array");
        System.out.println("0- Salir");
        System.out.println("Opcion: ");
        opcion = teclado.nextInt();


    
    switch(opcion) {
        case 1:
            
            System.out.println("Cadena: ");
            String cadena = teclado.next();
            ArrayList.add(cadena);
            modificado = true;
            break;
            
        case 2:
            
            
            System.out.println("Cadena: ");
            cadena = teclado.next();
            int posicion = ArrayList.indexOf(cadena);
            
            if(posicion >=0) {
                System.out.println("El elemento "+cadena+" se encuentra en la posicion "+posicion);
            }
            else {
                System.out.println("El elemento "+cadena+" NO se encuentra en el ArrayList");
            }
            break;
        case 3:
            
            System.out.println("Cadena: ");
            cadena = teclado.next();
            
            if(ArrayList.remove(cadena)) {
                System.out.println("El elemento "+cadena+" ha sido borrado");
            }
            else {
                System.out.println("El elemento "+cadena+" NO se ha encontrado");
            }
            modificado = true;
            break;
            
        case 4:
            for(posicion = 0; posicion < ArrayList.size();posicion++) {
                System.out.println(ArrayList.get(posicion));
            }
            
            break;
        case 0:
            teclado.close();
            System.out.println("Fin del programa");
            if (modificado) {
                try {
                FileOutputStream fos=new FileOutputStream("cadenas.dat");
                ObjectOutputStream oos = new ObjectOutputStream (fos);
        
                for (String cc : ArrayList) {
                    oos.writeObject(cc);
                }
            oos.close();
            fos.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            }
            System.exit(0);
    }
    
    } while(opcion != 0);
    teclado.close();
    }
}
