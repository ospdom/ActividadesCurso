package Lectura_Escritura_Ficheros;

import java.util.Scanner;

public abstract class Animal {

	// propiedades
	protected String cod;
	protected String nombre;

	// constructor por defecto
	public Animal() {
		this.cod = "";
		this.nombre = "";
	}

	// constructor copia
	public Animal(Animal a) {
		this.cod = a.cod;
		this.nombre = a.nombre;
	}

	// constructor personalizado
	public Animal(String cod, String nombre) {
		this.cod = cod;
		this.nombre = nombre;
	}
	
	public abstract void  print();
	
	public void leer(Scanner teclado) {
		// lee por teclado las propiedades
		// leo cod
		System.out.println("Ingresa el Código del Perro: ");
		this.cod = teclado.nextLine();
	
		// leo nombre
		System.out.println("Escribe el Nombre del Perro: ");
		this.nombre = teclado.nextLine();
	}
}

