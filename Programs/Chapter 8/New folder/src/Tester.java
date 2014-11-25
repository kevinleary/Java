import java.util.Scanner;
import java.lang.Math;

/*

Kevin Leary
Period 2
Date: 11/25/14
Chapter: 8
Excercise: 12

*/
public class Tester {

	public static void main(String[] args) {
		
		double fract = (double)17/(double)76;		//double casting
		double bnumer = 0;
		double bdenom = 0;
		double anumer = 0;
		double adenom = 1000;
		double diff = 1;
		double below =0;
		double above = 999999; 	//unreachable number 
		
		System.out.println("This program will display the fractions above and below 17/76");
		
		for(double i = 1; i <= 1000; i++){
			
			for (double j = 1; j <= 100; j++){
				
				if (below < (i/j))
					if((i/j) < fract){
						below = i/j;
						bnumer = i;
						bdenom = j;
			
					}
				
				if (above > (i/j))
					if ((i/j) > fract){
						above = (i/j);
						anumer = i;
						adenom = j;
					}
			}
		}
		
		System.out.println("The fraction above closest is " + (int)anumer + " / " + (int)adenom);
		System.out.println("The fraction below closest is " + (int)bnumer + " / " + (int)bdenom);	
		}

}
