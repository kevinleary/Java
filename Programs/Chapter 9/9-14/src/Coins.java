/*

Kevin Leary
Period 2
Date: 12/11/14
Chapter: 9
Excercise: 14

*/

public class Coins {
	
	private int coins, quarters, dimes, nickels, pennies;
	
	public Coins(int c){
		
		coins = c;
		quarters = coins / 25;
		dimes = coins / 10;
		nickels = coins / 5;
		pennies = coins / 1;
	}
	
	public int getQuarters(){
		
		return quarters;
	}
	
	public int getDimes(){
		
		return dimes;
	}
	
	public int getNickels(){
		
		return nickels;
	}
	
	public int getPennies(){
		
		return pennies;
	}
}
