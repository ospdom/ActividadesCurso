package Figura;

import java.util.Objects;

public class triangulo extends figura {

	protected double base;
	protected double altura;
	
	public triangulo () {
		super();
		this.base = 0;
		this.altura = 0;
	}
	
	public triangulo (triangulo t) {
		super (t);
		this.base = t.base;
		this.altura = t.altura;
	}
	public triangulo(int x, int y, double base, double altura) {
		super(x, y);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double area() {
		return ((base*altura)/2);
	}

	@Override
	public double perimetro() {
		
		return 3*base;
	}

	@Override
	public String toString() {
		return super.toString() + " Altura:" + altura + " Base:" + base;
	}

	@Override
	public int hashCode() {
		return Objects.hash(altura, base);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		triangulo other = (triangulo) obj;
		return Double.doubleToLongBits(altura) == Double.doubleToLongBits(other.altura)
				&& Double.doubleToLongBits(base) == Double.doubleToLongBits(other.base);
	}
	
	
	public int compareTo(triangulo other) {
		
		Double b1 = this.base;
		Double b2 = other.base;
		Double a1;
		Double a2;
		
		int comparacion = b1.compareTo(b2);
		
		if(comparacion == 0) {
			 a1 = this.altura;
			 a2 = other.altura;
			 comparacion = a1.compareTo(a2);
					
		}
			return comparacion;
		
		
	}
	

}
