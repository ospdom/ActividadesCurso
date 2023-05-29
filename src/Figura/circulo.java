package Figura;

import java.util.Objects;

public class circulo extends figura{
	
	protected double radio;
	
	public circulo() {
		super();
		this.radio = 1.0;
	}

	public circulo(circulo c) {
		super(c);
		this.radio = c.radio;
	}
	public circulo(int x, int y, double radio) {
		super(x, y);
		this.radio = radio;
		
	}

	@Override
	public double area() {
		
		return Math.PI*radio*radio;
	}

	@Override
	public double perimetro() {
		
		return (2*Math.PI * radio);
	}

	@Override
	public String toString() {
		return super.toString() + " Radio:" + radio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(radio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		circulo other = (circulo) obj;
		return Double.doubleToLongBits(radio) == Double.doubleToLongBits(other.radio);
	}
	
	public int compareTo(circulo other) {
		Double r1 = this.radio;
		Double r2 = other.radio;
		return r1.compareTo(r2);
		
	}
	
}
