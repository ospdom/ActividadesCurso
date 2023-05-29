package pizzeria;

import java.util.Scanner;

public class Pizza {
	
	private int id;
	private String nombre;
	private String ingredientes;
	private int precio;

	public Pizza() {
		this.id = 0;
		this.nombre = "";
		this.ingredientes = "";
		this.precio = 0;
	}
	
	public Pizza(Pizza p) {
		this.id = p.id;
		this.nombre = p.nombre;
		this.ingredientes = p.ingredientes;
		this.precio = p.precio;	
	}
	
	public Pizza(int id, String nombre, String ingredientes, int precio) {
		this.id = id;
		this.nombre = nombre;
		this.ingredientes = ingredientes;
		this.precio = precio;
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

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public void leer(Scanner teclado) {
		// lee por teclado las propiedades
		// leo cod
		System.out.println("Ingresa el Id de la Pizza: ");
		this.id = teclado.nextInt();
		// leo nombre
		teclado.nextLine();
		System.out.println("Ingresa el Nombre de la Pizza: ");
		this.nombre = teclado.nextLine();
		//leo ingredientes
		System.out.println("Ingresa los Ingredientes: ");
		this.ingredientes = teclado.next();
		//leo precio
		teclado.nextLine();
		System.out.println("Ingresa el precio de la Pizza: ");
		this.precio = teclado.nextInt();
	}

	public void print() {
		
		System.out.println("---Datos Pizza---");
		System.out.println("Id Pizza:" + this.id);
		System.out.println("Nombre:" + this.nombre);
		System.out.println("Ingredientes:" + this.ingredientes);
		System.out.println("Precio:" + this.precio);
		
	}
}
