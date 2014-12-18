import java.util.Scanner;
/*

Kevin Leary
Period 2
Date: 12/14/14
Chapter: 9
Excercise: 17

*/
public class ComplexTest {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		
		System.out.println("Complex numbers");
		
		Complex c = new Complex(-9);
		Complex c2 = new Complex(-64, -8);
		
		System.out.println(c.abs());
		
		System.out.println(c.add(c2));
		
		System.out.println(c.toString());
		
		System.out.println(c.multiply(c2));
		
	}

}
