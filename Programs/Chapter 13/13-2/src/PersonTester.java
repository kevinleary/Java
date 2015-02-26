import java.util.Scanner;
/*

Kevin Leary
Period 2
Date: 2/23/14
Chapter: 13
Excercise: 2

*/

//Tester
public class PersonTester {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two names to compare...");
		
		System.out.println("Enter 1st First name: ");
		String first1 = sc.next();
		
		System.out.println("Enter 2nd First name: ");
		String first2 = sc.next();

		System.out.println("Enter 1st Last name: ");
		String last1 = sc.next();
		
		System.out.println("Enter 2nd Last name: ");
		String last2 = sc.next();
		
		Person p1 = new Person(first1, last1);
		Person p2 = new Person(first2, last2);

		
		if(p1.compareTo(p2) >= 0){
			System.out.println(first2 + " " + last2);
			System.out.println(first1 + " " + last1);
		}
		
		else {
			System.out.println(first1 + " " + last1);
			System.out.println(first2 + " " + last2);
		}
		
	}
}
