import java.util.Scanner;
/*

Kevin Leary
Period 2
Date: 11/17/14
Chapter: 7
Excercise: 15

*/
public class Tester {
	
	 private static int bp, nb;
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("The choices of books you can buy are...");
		System.out.println("'Be Prepared' for $18.95");
		System.out.println("'Next Best' for $21.95");
		System.out.println("OR...");
		System.out.println("apzone.com has a deal for 2 books for $37.95");
		System.out.println("But wait there's more!");
		System.out.println("If you order 3 or more books you get them for $15.95 each!");
		System.out.println("EVEN MORE!");
		System.out.println("Buy 12 books or more and you get them for $14 EACH");
		
		System.out.println();
		System.out.print("How many books would you like to buy: ");
		
		int b = sc.nextInt();
		
		if (b == 1){		//determines which book they want if the answer is 1 
			System.out.println("Now which book would you like to buy?");
			System.out.println("Enter 1 for 'Be Prepared' Enter 2 for 'Next Best' : ");
			b = sc.nextInt();
			if (b == 1)
				bp+=1;
			
			else if (b == 2)
				nb+=1;
		}
		
		else if (b == 2){	//determines which book they want if the answer is 2
			
			System.out.println("Now which book would you like to buy?");
			System.out.println("Enter 1 for 'Be Prepared' Enter 2 for 'Next Best' Or Enter 3 for the deal pack: ");
			b = sc.nextInt();
			if (b == 1)
				bp+=2;
			
			else if (b == 2)
				nb+=2;
			
			else if (b == 3){
				nb+=1;
				bp+=1;
			}
				
		}
			
		else {
			bp = b + bp;
		
		}
		Order o = new Order();
		
		System.out.printf("\nThe total price for the amount of books you ordered is $%.2f", o.getOrderTotal(bp, nb));
				
		}
}