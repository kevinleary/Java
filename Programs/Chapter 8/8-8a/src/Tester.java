import java.util.Scanner;
/*

Kevin Leary
Period 2
Date: 11/25/14
Chapter: 8
Excercise: 8a

*/
public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a positive integer : ");
		int n = sc.nextInt();
		
		Digits d = new Digits();
		
		System.out.println("The sum of the digits is " + d.sumDigits(n));
	}

}
