package Figura;

import java.util.Objects;

public class rectangulo extends figura {

	protected double ancho;
	protected double alto;
	
	public rectangulo(){
		super();
		this.ancho = 1.0;
		this.alto = 1.0;
	}
	


	public rectangulo(rectangulo r) {
		
		super(r);
		this.alto = r.alto;
		this.ancho = r.ancho;
	}
	
	public rectangulo (int x, int y, double alto, double ancho) {
		
		super(x,y);
		this.ancho = ancho;
		this.alto = alto;
	}

	@Override
	public double area() {
	
		return ancho * alto;
	}

	@Override
	public double perimetro() {
		return ancho + alto + ancho+ alto;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Ancho:" + ancho + " Alto:" + alto;
	}



	@Override
	public int hashCode() {
		return Objects.hash(alto, ancho);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		rectangulo other = (rectangulo) obj;
		return Double.doubleToLongBits(alto) == Double.doubleToLongBits(other.alto)
				&& Double.doubleToLongBits(ancho) == Double.doubleToLongBits(other.ancho);
	}
	
	public int compareTo(rectangulo other) {
		Double area1 = this.area();
		Double area2 = other.area();
		return area1.compareTo(area2);
	}
}
