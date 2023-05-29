package Lectura_Escritura_Ficheros;

import java.util.Scanner;

public class Veterinario {

		// propiedades
		protected String dni;
		protected String nombre;
		protected String direccion;

		// constructor por defecto
		public Veterinario() {
			this.dni = "";
			this.nombre = "";
			this.direccion = "";
		}

		// constructor copia
		public Veterinario(Veterinario v) {
			this.dni = v.dni;
			this.nombre = v.nombre;
			this.direccion = v.direccion;
		}

		// constructor personalizado
		public Veterinario(String dni, String nombre, String direccion) {
			this.dni = dni;
			this.nombre = nombre;
			this.direccion = direccion;
		}
		
		public String print() {
			return "Veterinario [dni=" + dni + ", nombre=" + nombre + ", direccion=" + direccion + "]";
		}

		public void leer(Scanner teclado) {
			// lee por teclado las propiedades
			// leo cod
			System.out.println("Ingresa el DNI: ");
			this.dni = teclado.nextLine();
			// leo nombre
			System.out.println("Escriba el Nombre: ");
			this.nombre = teclado.nextLine();
			//leo direccion
			System.out.println("Escriba la Dirección: ");
			this.direccion = teclado.nextLine();
		}
	}

