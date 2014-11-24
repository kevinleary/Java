import java.util.Scanner;
/*

Kevin Leary
Period 2
Date: 11/24/14
Chapter: 8
Excercise: 2

*/
public class Tester {

	public static void main(String[] args) {
		double know = 10;
		int month = 1;
		
		while (know <=  95){
		know = know + (100 - know) *.1;
			month++;
		}
		
		System.out.print("It will take Kevin " + month + " months to score 95% on the exam");
	}

}
