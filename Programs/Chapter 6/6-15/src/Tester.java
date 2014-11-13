import java.util.Scanner;
/*

Kevin Leary
Period 2
Date: 11/11/14
Chapter: 6
Excercise: 15

*/
public class Tester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		System.out.print("Enter the current hour: ");
		int curHour = sc.nextInt();
		
		System.out.print("Now enter the current minute: ");
		int curMin = sc.nextInt();
		
		System.out.print("Now please enter your departure hour: ");
		int depHour = sc.nextInt();
		
		System.out.print("Now please enter your departure min: ");
		int depMin = sc.nextInt();
		
		Departed d = new Departed(curHour, curMin, depHour, depMin);
		
		d.calculateDepTime();
	}

}
