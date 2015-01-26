import java.util.Scanner;
/*

Kevin Leary
Period 2
Date: 1/11/15 
Chapter: 10
Excercise: 15

*/
public class DigitsTester {

	public static void main(String[] args) {
		
		System.out.print("Enter a string to test to see if it has digits: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		DigitsTester d = new DigitsTester();
		System.out.print(d.onlyDigits(str));

	}
	
	public boolean onlyDigits(String s)
	  {
	    for (int i = 0; i < s.length(); i++)
	      if (!Character.isDigit(s.charAt(i)))
	        return false;
	    return true;
	  }

}
