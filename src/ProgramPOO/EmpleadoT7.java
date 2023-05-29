package ProgramPOO;

import java.util.Scanner;

public class EmpleadoT7 extends PersonaT5{
//defino la clase Empleado
	// propiedades
	private String departamento;
	private String puesto;
	private double salario;
	// Constructor por defecto
	public EmpleadoT7(){
		// propiedades de Persona
		super();
		// propiedades de Empleado
		this.departamento = "";
		this.puesto = "";
		this.salario = 0.0;
	}
	// Constructor copia
	public EmpleadoT7(EmpleadoT7 e){
		// propiedades de Persona
		super(e);
		// propiedades de Empleado
		this.departamento=e.departamento;
		this.puesto = e.puesto;
		this.salario = e.salario;
	}
	//Constructor personalizado
	public EmpleadoT7(String d, String n, String a,FechaT5 f,String de, String pu,double sa){
		// propiedades de Persona
		super(d,n,a,f);
		// propiedades de Empleado
		this.departamento=de;
		this.puesto = pu;
		this.salario = sa;
	}
	//Constructor personalizado
	public EmpleadoT7(String de, String pu,double sa){
		// propiedades de Persona
		super();
		// propiedades de Empleado
		this.departamento=de;
		this.puesto = pu;
		this.salario = sa;
	}
	// toString
	@Override
	public String toString() {
		String resultado;
		// datos de Persona
		resultado = super.toString();
		// datos de Empleado
		// resultado = resultado + " Departamento: " + this.departamento;
		resultado += " " + this.departamento;
		resultado += " " + this.puesto;
		resultado += " " + this.salario;
		// devuelvo resultado
		return (resultado);
	}
	// Getters and Setters
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	// hashCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((departamento == null) ? 0 : departamento.hashCode());
		result = prime * result + ((puesto == null) ? 0 : puesto.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	// equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		// comparo la parte de Empleado
		return (super.equals(obj));
	}
	// compareTo
	public int compareTo(EmpleadoT7 other){
		// comparo solo como Persona
		return super.compareTo(other);
	}
	// leer
	public void leer(Scanner teclado){
		// leo las propiedades de Persona
		super.leer(teclado);
		// leo las propiedades de Empleado
		teclado.nextLine();
		System.out.print("Departamento: ");
		this.departamento = teclado.nextLine(); 
		System.out.print("Puesto: ");
		this.puesto = teclado.nextLine(); 
		System.out.print("Salario: ");
		double sal = teclado.nextDouble(); 
		while (sal < 0) {
			System.out.println("Error el salario no puede ser negativo!");
			System.out.print("Salario: ");
			sal = teclado.nextDouble();
		}
		this.salario = sal;
	}
}
