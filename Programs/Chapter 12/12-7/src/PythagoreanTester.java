import java.util.Scanner;
/*

Kevin Leary
Period 2
Date: 1/16/15 
Chapter: 12
Excercise: 7

*/
public class PythagoreanTester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an 'a' value for a Pythagorean Triple: ");
		int a = sc.nextInt();
		System.out.print("\nEnter an 'b' value for a Pythagorean Triple: ");
		int b = sc.nextInt();
		
		PythagoreanTester p = new PythagoreanTester();
		
		System.out.println("Your final c value for the Triple is : " + p.makePythagoreanTriple(a, b));
	}
	
	public int makePythagoreanTriple(int m, int n){
		
		int temp = 0; 
		if (n > m){
			temp = m;		//set temp to lower
			m = n;		//set m to highest 
			n = temp;	//set n to lowest
		}
		
		int triple[]  = new int[3];
		
		triple[0] = (m);
		triple[1] = (n);
		triple[2] = ((m *m)+ (n*n));
		return triple[2];
		
		
	}
}
