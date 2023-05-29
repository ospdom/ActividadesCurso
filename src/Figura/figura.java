package Figura;

public abstract class figura {

	protected int x;
	protected int y;
	


	public figura() {
		this.x = 0;
		this.y = 0;
	}
	
	public figura(figura f) {
		this.x = f.x;
		this.y = f.y;
	}
	public figura(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	public abstract double area();
	public abstract double perimetro();
	
	@Override
	public String toString() {
		return "X:" +x + " Y:" + y;
	}

	
	
	
}
