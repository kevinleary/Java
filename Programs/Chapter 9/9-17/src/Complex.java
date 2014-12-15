import java.lang.Math;
/*

Kevin Leary
Period 2
Date: 12/14/14
Chapter: 9
Excercise: 17

*/
public class Complex {
	
	private double acomp , bcomp;
	
	public Complex(double a ){
		acomp = a;
	}
	public Complex(double a, double b){
		acomp = a;
		bcomp = b;
	}
	
	public double abs(){
		
		return Math.sqrt((acomp * acomp) + (bcomp * bcomp));
		
	}
	
	public Complex add(Complex other){
		
		return new Complex((acomp + other.acomp) + (bcomp + other.bcomp));
	}
	
	public String toString(){
		
		return String.valueOf(acomp);
	}
	
	
}
