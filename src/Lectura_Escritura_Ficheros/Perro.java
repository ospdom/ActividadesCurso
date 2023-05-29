package Lectura_Escritura_Ficheros;

import java.util.Scanner;

public class Perro extends Animal{

	String raza;
	//constructor por defecto
	public Perro() {
		super();
		this.raza = "";
	}
	//constructor personalizado
	public Perro (String cod, String nombre,String raza) {
		super(cod,nombre);
		this.raza = raza;
	}
	//constructor copia
	public Perro (Perro p) {
		super(p);
		this.cod = p.cod;
		this.nombre = p.nombre;
		this.raza = p.raza;
	}

	@Override
	public void leer(Scanner teclado) {
	
		super.leer(teclado);
		System.out.println("Ingresa la Raza del perro: ");
		this.raza = teclado.nextLine();
		
	}
	@Override
	public void print() {
		System.out.println("***Datos del Perro***");
		System.out.println("Codigo:" + this.cod);
		System.out.println("Titulo:" + this.nombre);
		System.out.println("Raza:" + this.raza);
	}
}
