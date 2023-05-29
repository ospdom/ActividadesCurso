package pizzeria;

import java.util.Scanner;

public class Pedido {
	
	private int idpizza;
	private int idpedido;
	private int idusuario;
	private int cantidad;

	public Pedido() {
		this.idpizza = 0;
		this.idpedido = 0;
		this.idusuario = 0;
		this.cantidad = 0;
	}
	
	public Pedido(Pedido p) {
		this.idpizza = p.idpizza;
		this.idpedido = p.idpedido;
		this.idusuario = p.idusuario;
		this.cantidad = p.cantidad;	
	}
	
	public Pedido(int idpizza, int idpedido, int idusuario, int cantidad) {
		this.idpizza = idpizza;
		this.idpedido = idpedido;
		this.idusuario = idusuario;
		this.cantidad = cantidad;
	}

	public int getIdpizza() {
		return idpizza;
	}

	public void setIdpizza(int idpizza) {
		this.idpizza = idpizza;
	}

	public int getIdpedido() {
		return idpedido;
	}

	public void setIdpedido(int idpedido) {
		this.idpedido = idpedido;
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public void print() {
		
		System.out.println("---Datos Pedido---");
		System.out.println("Id Pizza:" + this.idpizza);
		System.out.println("Id Pedido:" + this.idpedido);
		System.out.println("Id Usuario:" + this.idusuario);
		System.out.println("Cantidad:" + this.cantidad);
	}

	public void leer(Scanner teclado) {
		
				// lee por teclado las propiedades
				// leo cod
				System.out.println("Id Pizza: ");
				this.idpizza = teclado.nextInt();
				// leo nombre
			
				System.out.println("Id Pedido: ");
				this.idpedido = teclado.nextInt();
				//leo ingredientes
				
				System.out.println("Id Usuario: ");
				this.idusuario = teclado.nextInt();
				//leo precio
		
				System.out.print("Ingresa el precio de la Pizza: ");
				this.cantidad = teclado.nextInt();
	}

	
}