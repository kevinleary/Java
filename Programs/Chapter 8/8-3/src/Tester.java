import java.util.Scanner;
/*

Kevin Leary
Period 2
Date: 11/24/14
Chapter: 8
Excercise: 3

*/
public class Tester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer to add the sum of the odd digits in it: ");
		int n = sc.nextInt();
		
		Odds o = new Odds();
		
		System.out.print("The sum of all odd digits of " + n + " is " + o.addOdds(n));
		
	}

}
