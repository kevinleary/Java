import java.util.Scanner;
/*

Kevin Leary
Period 2
Date: 11/10/14
Chapter: 6
Excercise: 13 

*/
public class Tester {

	private int numb;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a 3 digit integer: ");
		
		int n = sc.nextInt();
		
		Swapped swap = new Swapped(n);
		
		swap.Swapper();

	}

}
