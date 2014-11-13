import java.util.Scanner;
/*

Kevin Leary
Period 2
Date: 11/12/14
Chapter: 6
Excercise: 17

*/
public class Tester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("This program will display the the cost of jars of jam you bought!");
		System.out.println("Costs are added out by lb(s)($0.96/lb), by containers($1.44 each), and a $3 service charge");
		
		System.out.println("Enter how many jars of Jam you want (1lb 5oz): ");
		int jam = sc.nextInt();
		
		if (jam / 12 >= 1)
			System.out.println("You also get " + (jam/12) + " containers which each weigh (1lb 9oz)");

		
		
		
	}

}
