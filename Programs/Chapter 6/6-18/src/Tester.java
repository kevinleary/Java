import java.util.Scanner;
/*

Kevin Leary
Period 2
Date: 11/12/14
Chapter: 6
Excercise: 18

*/
public class Tester {

	private static int b;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select 1 to convert from dog to human or 2 to convert from human to dog years");
		int s = sc.nextInt();
		
		DogtoHuman d = new DogtoHuman();
		
		int a = 0, b = 0;
		
		if (s == 1){
			System.out.println("Enter the age in human years to convert to dog years : ");
			a = sc.nextInt();
			b =0;
		}

		if (s == 2){
			
			System.out.print("Enter the age in dog years to convert to human years : ");
			b = sc.nextInt();
			a =0;

		}

		
		System.out.println("The converted age is " + d.convertToHumanAge(a, b));

	}

}
