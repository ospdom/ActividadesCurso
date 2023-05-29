package actividadesenclase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class VeterinarioMainBD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Veterinario> arrayList = new ArrayList<Veterinario>();

		Veterinario v = new Veterinario();

		ArrayList<Perro> arrayListPerro = new ArrayList<Perro>();

		

		int opcion;
		int posicion;
		boolean modificadov = false;
		boolean modificadop = false;

		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bdveterinario", "root", "");
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM bdveterinario.veterinario;");

			String dni;
			String nombre;
			String direccion;

			while (rs.next()) {
				// por cada registro tomo sus propiedades
				dni = (String) rs.getObject("dni");
				nombre = (String) rs.getObject("nombre");
				direccion = (String) rs.getObject("direccion");

				// añado un nuevo objeto al arraylist
				arrayList.add(new Veterinario(dni, nombre, direccion));
			}
			// cierro el resultset
			rs.close();
			// cierro el statement despues de realizar la consulta
			st.close();

			// cierro la conexion
		} catch (SQLException e) {
			// si no se ha conectado correctamente
			System.out.println("Error de conexión");
		}

		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("Elige una de las siguientes opciones");
			System.out.println("1- Añadir Perro");
			System.out.println("2- Añadir Veterinario");
			System.out.println("3- Listar Perro");
			System.out.println("4- Listar Veterinario");
			System.out.println("0- Salir");
			System.out.println("Opcion: ");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				Perro p = new Perro();
				teclado.nextLine();
				System.out.println("Añadir Perro: ");
				p.leer(teclado);

				if (arrayList.contains(p))
					System.out.println("El Perro ya existe");
				else {
					arrayListPerro.add(new Perro(p));
					System.out.println("El Perro a sido añadido correctamente");
					modificadop = true;
				}

				break;

			case 2:

				teclado.nextLine();
				System.out.println("Añadir Veterinario: ");
				v.leer(teclado);

				if (arrayList.contains(v))
					System.out.println("El Veterinario ya existe");
				else {
					arrayList.add(new Veterinario(v));
					System.out.println("El Veterinario a sido añadido correctamente");
					modificadov = true;
				}
				break;
			case 3:
				for (posicion = 0; posicion < arrayListPerro.size(); posicion++) {
					arrayListPerro.get(posicion).print();
				}
				break;

			case 4:
				
				for (posicion = 0; posicion < arrayList.size(); posicion++) {
					arrayList.get(posicion).print();
				}
				break;

			}

		} while (opcion != 0);
		teclado.close();

		if (modificadov) {
			try {
				System.out.println("OK");
				Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bdveterinario", "root", "");
				String consulta = "";

				Statement st = conexion.createStatement();
				consulta = "DELETE FROM veterinario;";
				st.executeUpdate(consulta);

				String dni;
				String nombre;
				String direccion;

				for (posicion = 0; posicion < arrayList.size(); posicion++) {
					// obtengo el elemento
					v = arrayList.get(posicion);
					dni = v.getDni();
					nombre = v.getNombre();
					direccion = v.getDireccion();
					// genero la consulta a ejecutar
					v.print();
					consulta = "insert into bdveterinario.veterinario values ('" + dni + "','" + nombre + "','" + direccion +"');";
					// ejecuto la consulta
					st.executeUpdate(consulta);
				}
				// cierro el statement despues de realizar la consulta
				st.close();
				// cierro la conexion
				conexion.close();

			} catch (SQLException e) {
				System.out.println("Error de conexion");
			}
		}
		System.out.println("Agur");
	}
}



