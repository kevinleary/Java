/*

Kevin Leary
Period 2
Date: 2/24/14
Chapter: 13
Excercise: 4a

*/
public class QuadraticFunctionTester {

	public static void main(String[] args) {

		QuadraticFunction q1 = new QuadraticFunction(1, - 5, 6);
		QuadraticFunction q2 = new QuadraticFunction(1, - 5, 6);
		QuadraticFunction q3 = new QuadraticFunction(1, 4, 8);
		
		System.out.println(q1.toString());
		
		System.out.println(q1.equals(q2));		//tests true
		
		System.out.println(q1.equals(q3));		//tests false
		
		
	}

}
