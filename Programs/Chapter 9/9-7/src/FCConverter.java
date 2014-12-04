import java.util.Scanner;
import java.lang.Math;

/*

Kevin Leary
Period 2
Date: 12/1/14
Chapter: 9
Excercise: 7

*/
public class FCConverter {
	
	public double d;	//used public so the variable can reach the code in temperature
	
	public void setCelsius(double degrees) {
		
		d = degrees;
		
	}
	
	public void setFahrenheit(double degrees) {
		
		d = degrees;
		
	}
	
	public double getFahrenheit() {
		 
		return ( (9 * (d / 5) + 32));
	}

	public double getCelsius() {
		
		return (((d - 32) * 5) / 9);
	}
	
	
}
