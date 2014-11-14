import java.util.Scanner;
/*

Kevin Leary
Period 2
Date: 11/12/14
Chapter: 6
Excercise: 18

*/
public class Tester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the age in human years to go to dog years : ");
		int a = sc.nextInt();
		
		DogtoHuman d = new DogtoHuman();
		
		System.out.println("The human age of the dog is " + d.convertToHumanAge(a));

	}

}
