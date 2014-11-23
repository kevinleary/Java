import java.util.Scanner;
/*

Kevin Leary
Period 2
Date: 11/18/14
Chapter: 7
Excercise: 17

*/
public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size1: ");
		int size1 = sc.nextInt();
		
		System.out.print("Enter size2: ");
		int size2 = sc.nextInt();
		
		System.out.println("Enter the amount of space on the cd: ");
		int space = sc.nextInt();
		
		CD c = new CD();
		
		c.findBestFit(size1, size2, space);
		

	}

}
