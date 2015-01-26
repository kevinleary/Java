import java.util.Scanner;
/*

Kevin Leary
Period 2
Date: 1/11/15 
Chapter: 10
Excercise: 6

*/
public class ScrollTester {

	public static void main(String[] args) {
		
		System.out.print("Enter a string to have the first letter moved to the back: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		ScrollTester s1 = new ScrollTester();
		System.out.println(s1.scroll(str));
		
	}
	
	public String scroll(String s){
		
		String s1 = s.substring(0, 1);
		String s2 = s.substring(1);
		s = s2 + s1;
		return s;
	}

}
