import java.util.Scanner;
/*

Kevin Leary
Period 2
Date: 11/24/14
Chapter: 8
Excercise: 1

*/
public class Tester {


	public static void main(String[] args) {
		double sPop = 106.2;
		int y = 0;
		
		while (sPop <= 120){
			sPop = sPop + (sPop * .017);
			y++;
		}
		
		System.out.println("The Population of Mexico in " + (y + 2005) + " is " + sPop + " million");

	}

}
