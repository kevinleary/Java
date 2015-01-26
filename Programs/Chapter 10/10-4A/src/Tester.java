import java.util.Scanner;
/*

Kevin Leary
Period 2
Date: 1/11/15 
Chapter: 10
Excercise: 4a

*/
public class Tester {

	public static void main(String[] args) {
		System.out.print("Enter a date in mm/dd/yy format including the slashes: ");
		Scanner sc = new Scanner(System.in);
		String dateStr = sc.next();
		
		 dateStr = dateStr.substring(3,5) + '-' +
	              dateStr.substring(0,2) + '-' +
	              dateStr.substring(6);
		 
		 System.out.print(dateStr);
	}

}
