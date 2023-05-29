package Figura;

public class figuraMain {

	public static void main(String[] args) {
		
		circulo c1 = new circulo();
		System.out.println("Area del circulo: " + c1.area());
		System.out.println("Perimetro del circulo: " + c1.perimetro());
		
		System.out.println();
		
		rectangulo r1 = new rectangulo (0,0,3,2);
		System.out.println("Area del rectangulo: " + r1.area());
		System.out.println("Perimetro del rectangulo: " + r1.perimetro());
		
		System.out.println();
		
		triangulo t1 = new triangulo (0,0,4,3);
		System.out.println("Area del rectangulo: " + t1.area());
		System.out.println("Perimetro del rectangulo: " + t1.perimetro());
		
		System.out.println();
		
		cuadrado cu1 = new cuadrado (0,0,2);
		System.out.println("Area del cuadrado: " + cu1.area());
		System.out.println("Perimetro del cuadrado: " + cu1.perimetro());
		
		System.out.println();
		
		System.out.println(c1);
		System.out.println(r1);
		System.out.println(t1);
		System.out.println(cu1);
		
		System.out.println();
		
		triangulo t2 = new triangulo(0,0,4,2);
		System.out.println(t1.compareTo(t2));
		
	
		if(t1.equals(t2)) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}
		
		cuadrado cu2 = new cuadrado(0,0,5);
		cuadrado cu3 = new cuadrado(0,0,2);
		
		if(cu2.equals(cu3)) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}
		
		circulo c3 = new circulo(0,0,3);
		circulo c4 = new circulo(0,0,6);
		if(c3.compareTo(c4) < 0) {
			System.out.println("es menor");
		}else if(c3.compareTo(c4) == 0) {
			System.out.println("son iguales");
		}else if(c3.compareTo(c4) > 0) {
			System.out.println("es mayor");
		}
		
		triangulo t4 = new triangulo(0,0,3,4);
		triangulo t5 = new triangulo(0,0,6,6);

	}

}
