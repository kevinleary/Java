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
		System.out.print("Enter a positive integer under 10: ");
		int n = sc.nextInt();
		
		Add a = new Add();
		
		a.getTotal(n);
	}

}
