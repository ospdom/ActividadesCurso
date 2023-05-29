package actividadesenclase;

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
		
		public void print() {
			
			System.out.println("***Datos del Veterinario***");
			System.out.println("Dni:" + this.dni);
			System.out.println("Nombre:" + this.nombre);
			System.out.println("Dirección:" + this.direccion);

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

		public String getDni() {
			return dni;
		}

		public void setDni(String dni) {
			this.dni = dni;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
	}

