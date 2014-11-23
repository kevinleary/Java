import java.util.Scanner;
/*

Kevin Leary
Period 2
Date: 11/18/14
Chapter: 7
Excercise: 19

*/
public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number 1-10 (or 0 to quit): ");
		int n = sc.nextInt();
		
		Poem p = new Poem();
		
		p.finishPoem(n);
	}

}
