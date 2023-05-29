package Figura;

import java.util.Objects;

public class cuadrado extends rectangulo{

	protected double lado;
	
	public cuadrado() {
		super();
		
	}
	
	public cuadrado (cuadrado c) {
		super(c);
		
	}
	public cuadrado(int x, int y, double lado) {
		
		super(x, y, lado, lado);
		
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(lado);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		cuadrado other = (cuadrado) obj;
		return Double.doubleToLongBits(lado) == Double.doubleToLongBits(other.lado);
	}
	


}
