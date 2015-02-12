
public class RightTriangle extends Triangle{

	public RightTriangle(double a) {
		super(a);
		
	}

	
	public double getPerimeter() {
		
		return (2 + Math.sqrt(2.0)) * getSide();
	}

	
	public double getArea() {
		
		 return getSide() * getSide() / 2;
	}
	
	

}
