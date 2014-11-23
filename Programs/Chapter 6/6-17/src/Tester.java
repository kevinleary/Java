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
		
		System.out.print("Enter how many jars of Jam you want (1lb 5oz): ");
		double jars = sc.nextDouble();
		
		if (jars / 10 >= 1)
			System.out.println("You also get " + ((jars+9)/10) + " containers which each weigh (1lb 9oz)");

		System.out.println("Now to calculate the total cost...");
		
		Jam j = new Jam(jars);
		
		System.out.printf("\nYour total cost for shipping is $%.2f", j.computeShippingCost());
	}

}
