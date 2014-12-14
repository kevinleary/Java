import java.util.Scanner;
/*

Kevin Leary
Period 2
Date: 12/11/14
Chapter: 9
Excercise: 14

*/
public class TesterCoins {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the amount of change in cents: ");
		int c = sc.nextInt();
		
		Coins cn = new Coins(c);
		
		System.out.println("There will be " + cn.getQuarters() + " quarters.");
		System.out.println("Or there will be " + cn.getDimes() + " dimes.");
		System.out.println("Or there will be " + cn.getNickels() + " nickels.");
		System.out.println("Or lastly there will be " + cn.getPennies() + " pennies.");
		
	}

}
