package pizzeria;

import java.util.Scanner;

public class Usuario {

	private int id;
	private String nombre;
	private String apellido;

	public Usuario() {
		this.id = 0;
		this.nombre = "";
		this.apellido = "";
	}
	
	public Usuario(Usuario p) {
		this.id = p.id;
		this.nombre = p.nombre;
		this.apellido = p.apellido;
	}
	
	public Usuario(int id, String nombre, String apellido) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

public void print() {
		
		System.out.println("---Datos Pedido---");
		System.out.println("Id :" + this.id);
		System.out.println("Nombre:" + this.nombre);
		System.out.println("Apellido:" + this.apellido);
	
	}

	public void leer(Scanner teclado) {
		
				// lee por teclado las propiedades
				// leo cod
				System.out.println("Id Usuario: ");
				this.id = teclado.nextInt();
				// leo nombre
			
				System.out.println("Nombre: ");
				this.nombre = teclado.nextLine();
				//leo ingredientes
				
				System.out.println("Apellido: ");
				this.apellido = teclado.nextLine();
				
	}
}
