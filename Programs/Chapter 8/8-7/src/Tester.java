import java.util.Scanner;
/*

Kevin Leary
Period 2
Date: 11/25/14
Chapter: 8
Excercise: 7

*/
public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number to test if it is a perfect square: ");
		int n = sc.nextInt();
		
		Square s = new Square();
		
		System.out.println(s.isPerfectSquare(n));
	}

}
