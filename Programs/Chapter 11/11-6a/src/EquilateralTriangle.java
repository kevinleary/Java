
public class EquilateralTriangle extends Triangle{

	public EquilateralTriangle(double a) {
		super(a);
		
	}

	
	public double getPerimeter() {
		
		return 3 * getSide();
	}

	
	public double getArea() {
		
		return Math.sqrt(3) / 4 * getSide() * getSide();
	}
	
	

}
