import java.util.Scanner;
/*

Kevin Leary
Period 2
Date: 12/7/14
Chapter: 9
Excercise: 10

*/
public class Tester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a width for a rectangle or square: ");
		int w = sc.nextInt();
		System.out.print("\nEnter a height for a rectangle or square: ");
		int h = sc.nextInt();
		
		int s = w * h;
		
		Rectangle r1 = new Rectangle(w, h);
		Rectangle r2 = new Rectangle(w);
		Rectangle r3 = new Rectangle();
		Rectangle r = new Rectangle();
		
		
		System.out.print(r2.isSquare(8, 8));
		//System.out.print("\nThe square would be " + r2.Quadratize(s));
		r1.isSquare(s, w);
		
		
	}

}
