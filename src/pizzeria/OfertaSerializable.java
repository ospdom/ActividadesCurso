package pizzeria;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class OfertaSerializable {
	
	public static void main(String[] args) {
	
	
		Oferta o = new Oferta(1,"2x1",1);
	
		try {
			FileOutputStream fos = new FileOutputStream("oferta.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			// lo grabo
			oos.writeObject(o);
			// cierro el fichero
			oos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
