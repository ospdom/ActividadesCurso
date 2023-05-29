package actividadesenclase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PerroSerializable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Perro p = new Perro("1","Lola","Bulldog");
		
		
		// lo guardo en el fichero perro.dat
		try {
			FileOutputStream fos = new FileOutputStream("perro.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			// lo grabo
			oos.writeObject(p);
			// cierro el fichero
			oos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}
		// LEER
		FileInputStream fis;
		ObjectInputStream ois;
		try {
			fis = new FileInputStream("perro.dat");
			ois = new ObjectInputStream(fis);
			p = (Perro) ois.readObject();// convierte los bytes leido es un objeto de la clase Complejo
			ois.close();
			fis.close();
			System.out.println("Valor leido: " + p);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
