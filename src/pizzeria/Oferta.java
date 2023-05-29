package pizzeria;

import java.io.Serializable;
import java.util.Scanner;

public class Oferta implements Serializable {
	
	private int id;
	private String nombre;
	private int idPizza;

	public Oferta() {
		this.id = 0;
		this.nombre = "";
		this.idPizza = 0;
	}
	public Oferta(Oferta o) {
		this.id = o.id;
		this.nombre = o.nombre;
		this.idPizza = o.idPizza;
	}
	public Oferta(int id, String nombre, int idPizza) {
		this.id = id;
		this.nombre = nombre;
		this.idPizza = idPizza;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getIdPizza() {
		return idPizza;
	}
	public void setIdPizza(int idPizza) {
		this.idPizza = idPizza;
	}
	
	public void print()  {

		System.out.println("---Datos Oferta---");
		System.out.println("Id :" + this.id);
		System.out.println("Nombre:" + this.nombre);
		System.out.println("Id Pizza:" + this.idPizza);
	}
	public void leer(Scanner teclado) {
		// lee por teclado las propiedades
		// leo cod
		System.out.print("Ingresa el Id de la Pizza: ");
		this.id = teclado.nextInt();
		// leo nombre
		System.out.println("Ingresa el Nombre de la Pizza: ");
		this.nombre = teclado.nextLine();
		//leo ingredientes
		System.out.println("Ingresa los Ingredientes: ");
		this.idPizza = teclado.nextInt();
		
		}
		
	}


