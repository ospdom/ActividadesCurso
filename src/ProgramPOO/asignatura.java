package ProgramPOO;

import java.util.Objects;
import java.util.Scanner;

public class asignatura implements Comparable<asignatura>{
	

	
	//Definir clase y atributos
	 String codigo ;
	 String descripcion;
	 Double nota;
	 
	 //Constructor por defecto
	public asignatura() {
		this.codigo = "";
		this.descripcion="";
		this.nota = 0.0;
	}
	
	//Constructor personalizado
	public asignatura(String codigo, String descripcion, Double nota){
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.nota = nota;
	}
	
	//Constructor copia
	public asignatura(asignatura a) {
		this.codigo = a.codigo;
		this.descripcion = a.descripcion;
		this.nota = a.nota;
	}

	//Getters y Setters
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	//Metodo toString
	@Override
	public String toString() {
		return codigo + " - " + nota;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, descripcion, nota);
	}

	//Metodo equals, hashcode
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		asignatura other = (asignatura) obj;
		
		if(this.codigo.equals(other.codigo) && this.nota == other.nota) {
			return true;
		}
		
		return false;
	}

	//Metodo compareTo
	@Override
	public int compareTo(asignatura other) {
		
		int comparacion = this.codigo.compareTo(other.codigo);

		if (comparacion == 0) {
			
			Double n1 = this.nota;
			Double n2 = other.nota;
			comparacion = n1.compareTo(n2);
	
			
		}
		
			return comparacion;
		}
	
	public void leer(Scanner sc) {
		
		System.out.println("Inserta el codigo");
		this.codigo = sc.next();
		
		System.out.println("Insertar descripcion");
		this.descripcion = sc.next();
		
		System.out.println("Insertar nota");
		this.nota = sc.nextDouble();
		
		sc.nextLine();
	}
		
	
}

