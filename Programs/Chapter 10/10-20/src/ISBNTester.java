import java.util.Scanner;
/*

Kevin Leary
Period 2
Date: 1/11/15 
Chapter: 10
Excercise: 20

*/
public class ISBNTester {

	public static void main(String[] args) {
		
		System.out.print("ENTER A VALID ISBN NUMBER: ");
		Scanner sc = new Scanner(System.in);
		String isbn = sc.next();
		
		//ISBNTester t = new ISBNTester();
		System.out.println(ISBNTester.isValidISBN(isbn));
		

	}
	
	public static boolean isValidISBN(String isbn){
		
		int isbnVal = 0;
		
		for (int i = 0; i <= isbn.length(); i++){
			
			isbnVal = isbnVal + Integer.parseInt(isbn, i);		//get a weird exception...
			System.out.println(isbnVal);
			
		}
		
		//Character.digit(, arg1)
		if (isbnVal % 11 == 0)
			return true;
		else
			return false;

	}

}
