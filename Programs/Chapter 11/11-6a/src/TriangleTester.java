/*

Kevin Leary
Period 2
Date: 2/10/14
Chapter: 11
Excercise: 6a

*/

//Tester
public class TriangleTester {

	  public static void main(String[] args)
	  {
	    Triangle equilateralTr = new EquilateralTriangle( 12);
	    Triangle rightTr = new RightTriangle( 12);
	    
	    System.out.println("Equilateral " + equilateralTr.getRatio());
	    System.out.println("Right isosceles " + rightTr.getRatio());
	  }

}
