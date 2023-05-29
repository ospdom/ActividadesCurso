package pizzeria;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class PizzeriaMain {

	public static void main(String[] args) {

		ArrayList<Pizza> aPizza = new ArrayList<Pizza>();
		Pizza pi = new Pizza();

		ArrayList<Usuario> aUsuario = new ArrayList<Usuario>();
		Usuario us = new Usuario();

		ArrayList<Pedido> aPedido = new ArrayList<Pedido>();
		Pedido pe = new Pedido();

		ArrayList<Oferta> aOferta = new ArrayList<Oferta>();
		Oferta o = new Oferta();

		int opcion;
		int posicion;
		boolean modificadopi = false;
		boolean modificadous = false;
		boolean modificadope = false;
		boolean modificadoo = false;

		// LEER
		FileInputStream fis;
		ObjectInputStream ois;
		try {
			fis = new FileInputStream("oferta.dat");
			ois = new ObjectInputStream(fis);
			while (fis.available() > 0) {
				o = (Oferta) ois.readObject();// convierte los bytes leido es un objeto de la clase 
				aOferta.add(o);
			}
			ois.close();
			fis.close();
			System.out.println("Oferta: " + o);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			ResultSet rs;
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bdpizzeria", "root", "");
			System.out.println("Conexión Correcta.");
			Statement st = conexion.createStatement();
			rs = st.executeQuery("SELECT * FROM bdpizzeria.pizza;");
			while (rs.next()) {
				int idPizza = rs.getInt("id");
				aPizza.add(new Pizza(rs.getInt("id"), rs.getString("nombre"), rs.getString("ingredientes"),
						rs.getInt("precio")));
			}
			rs = st.executeQuery("SELECT * FROM bdpizzeria.pedido;");
			while (rs.next()) {
				aPedido.add(new Pedido(rs.getInt("idpizza"), rs.getInt("idusuario"), rs.getInt("idpedido"),
						rs.getInt("cantidad")));
			}
			rs = st.executeQuery("SELECT * FROM bdpizzeria.usuario;");
			while (rs.next()) {
				aUsuario.add(new Usuario(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellido")));
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
			System.out.println("1- Listar las Pizzas");
			System.out.println("2- Listar Usuarios");
			System.out.println("3- Listar Pedidos");
			System.out.println("4- Añadir una nueva Pizza");
			System.out.println("5- Añadir un nuevo Usuario");
			System.out.println("6- Añadir un nuevo Pedido");
			System.out.println("7. Listar Ofertas de Pizza");
			System.out.println("8. Añadir una nueva oferta de Pizza");
			System.out.println("9. Visualizar ofertas de una Pizza");
			System.out.println("0- Salir");
			System.out.println("Opcion: ");
			opcion = teclado.nextInt();
			
			boolean correcto = false;
			while (!correcto)
			{
				System.out.println("Introduce una fecha válida: ");
				String fechaEnCadena = teclado.next();
				try
				{
					LocalDate fecha = LocalDate.parse(fechaEnCadena);
					correcto = true;
				}
				catch(Exception ex)
				{
					System.out.println("La fecha no es válida.");
					correcto = false;
				}
			}

			switch (opcion) {
			case 1:
				for (posicion = 0; posicion < aPizza.size(); posicion++) {
					aPizza.get(posicion).print();
				}
				break;
			case 2:
				for (posicion = 0; posicion < aUsuario.size(); posicion++) {
					aUsuario.get(posicion).print();
				}
				break;
			case 3:
				for (posicion = 0; posicion < aPedido.size(); posicion++) {
					aPedido.get(posicion).print();
				}
				break;
			case 4:

				System.out.println("Añadir Pizza: ");
				pi.leer(teclado);

				if (aPizza.contains(pi))
					System.out.println("La Pizza ya existe");
				else {
					aPizza.add(new Pizza(pi));
					System.out.println("La Pizza a sido añadida correctamente");
					modificadopi = true;
				}
				break;
			case 5:

				System.out.print("Añadir Usuario: ");
				us.leer(teclado);

				if (aUsuario.contains(us))
					System.out.println("El Usuario ya existe");
				else {
					aUsuario.add(new Usuario(us));
					System.out.println("El Usuario a sido añadido correctamente");
					modificadous = true;
				}

				break;
			case 6:

				System.out.print("Añadir Pedidos: ");
				pe.leer(teclado);

				if (aPedido.contains(pe))
					System.out.println("El Pedido ya existe");
				else {
					aPedido.add(new Pedido(pe));
					System.out.println("El Pedido a sido añadido correctamente");
					modificadope = true;
				}

				break;
			case 7:
				for (posicion = 0; posicion < aOferta.size(); posicion++) {
					aOferta.get(posicion).print();
				}
				break;
			case 8:
				System.out.print("Añadir Oferta: ");
				o.leer(teclado);

				if (aOferta.contains(o))
					System.out.println("La 	Oferta ya existe");
				else {
					aOferta.add(new Oferta(o));
					System.out.println("La Oferta a sido añadido correctamente");
					modificadoo = true;
				}

				break;

			}
		} while (opcion != 0);
		teclado.close();
		if (modificadopi) {
			try {
				System.out.println("OK");
				Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bdpizzeria", "root", "");
				String consulta = "";

				Statement st = conexion.createStatement();
				consulta = "DELETE FROM pizza;";
				st.executeUpdate(consulta);

				int id;
				String nombre;
				String ingredientes;
				int precio;

				for (posicion = 0; posicion < aPizza.size(); posicion++) {
					// obtengo el elemento
					pi = aPizza.get(posicion);
					id = pi.getId();
					nombre = pi.getNombre();
					ingredientes = pi.getIngredientes();
					precio = pi.getPrecio();
					// genero la consulta a ejecutar
					pi.print();
					consulta = "insert into bdpizzeria.pizza values ('" + id + "','" + nombre + "','" + ingredientes
							+ "','" + precio + "');";
					// ejecuto la consulta
					int retorno = st.executeUpdate(consulta);
				}
				// cierro el statement despues de realizar la consulta
				st.close();
				// cierro la conexion
				conexion.close();

			} catch (SQLException e) {
				System.out.println("Error de conexion");
			}
		}
		if (modificadous) {
			try {
				System.out.println("OK");
				Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bdpizzeria", "root", "");
				String consulta = "";

				Statement st = conexion.createStatement();
				consulta = "DELETE FROM usuario;";
				st.executeUpdate(consulta);

				int id;
				String nombre;
				String apellido;
				
				String codigoDeVuelo = "VUY001";
				float precio = 100.0f;
				LocalDate fecha = LocalDate.now();
				st.executeUpdate("INSERT INTO ReservasDeVuelos VALUES ('" + codigoDeVuelo + "', " + precio + ", " + String.format("yyyyMMdd", fecha) + ")");

				for (posicion = 0; posicion < aUsuario.size(); posicion++) {
					// obtengo el elemento
					us = aUsuario.get(posicion);
					id = us.getId();
					nombre = us.getNombre();
					apellido = us.getApellido();
					// genero la consulta a ejecutar
					pi.print();
					consulta = "insert into bdpizzeria.usuario values ('" + id + "','" + nombre + "','" + apellido
							+ "');";
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
		if (modificadope) {
			try {
				System.out.println("OK");
				Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bdpizzeria", "root", "");
				String consulta = "";

				Statement st = conexion.createStatement();
				consulta = "DELETE FROM pedido;";
				st.executeUpdate(consulta);

				int idpizza;
				int idpedido;
				int idusuario;
				int cantidad;

				for (posicion = 0; posicion < aPedido.size(); posicion++) {
					// obtengo el elemento
					pe = aPedido.get(posicion);
					idpizza = pe.getIdpizza();
					idpedido = pe.getIdpedido();
					idusuario = pe.getIdusuario();
					cantidad = pe.getCantidad();
					// genero la consulta a ejecutar
					pi.print();
					consulta = "insert into bdpizzeria.pedido values ('" + idpizza + "','" + idpedido + "','"
							+ idusuario + "','" + cantidad + "');";
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
