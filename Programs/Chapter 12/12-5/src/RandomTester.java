import java.util.Scanner;
/*

Kevin Leary
Period 2
Date: 1/16/15 
Chapter: 12
Excercise: 5

*/
public class RandomTester {

	public static void main(String[] args) {
		RandomTester r = new RandomTester();
		System.out.print(r.getRandomRps());

	}
	
	  public char getRandomRps()
	  {
	    char[] rps =
	       {'r', 'r', 'r', 'p', 'p', 'p', 'p', 'p',
	        's', 's', 's', 's', 's', 's'};

	    int i = (int)(Math.random() * rps.length);
	    return rps[i];
	  }
}
