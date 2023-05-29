package ProgramParaCrios;

import java.util.Scanner;

public class ProgramParaCrios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		String name,pass;
		int edad;
		
		System.out.println("Introduce tu nombre");
		name = teclado.next();
		System.out.println("Introduce la contraseña");
		pass = teclado.next();
		
		while (pass.equals("program")==false) {

			System.out.println("introduce otra vez la contraseña: ");
			pass = teclado.next();
		}
		System.out.println("Bienvenido " + name + "!");
	
		System.out.println("¿Que edad tienes?");
		edad = teclado.nextInt();
		if (edad < 18) {
			System.out.println("No tienes acceso al sistema");
			}
		else {
			System.out.println("Bienvenido " + name + " ");
		
		System.out.println("1 sumar numeros");
		System.out.println("2 comprobrar si existe la letra A");
		System.out.println("3 salir ");
		
		
		int menu;
		
		menu = teclado.nextInt();
		switch (menu) {
		}}}}
	
