/*

Kevin Leary
Period 2
Date: 2/24/14
Chapter: 13
Excercise: 4a also includes a,b,c,d

*/

public class QuadraticFunction implements Comparable<QuadraticFunction>{
	
	private int a, b, c;
	
	
	public QuadraticFunction(int aval, int bval, int cval){
		
		a = aval;
		b = bval;
		c = cval;
		
	}
	
	public double valueAt(double x){
		//double quad;
		return  a * (x * x) + b * x + c;
		
	}
	
	public int compareTo(QuadraticFunction other){
	
		return compareTo(QuadraticFunction(other.valueAt()));
		
	}
	
	public boolean equals(QuadraticFunction other){
		
		
		if(a == other.a)
			if(b == other.b)
				if(c == other.c)
					return true;
				else
					return false;
		
		return false;
	}
	
	public String toString(){
		
		if (a==1){
			 
			if (b > 0 && c > 0)
				return "x^2" + "+" + b + "x" + "+" + c; 
			
			else if (b > 0 && c < 0)
				return "x^2" + "+" + b + "x" + c;
			
			else if (b < 0 && c > 0)
				return "x^2" +  b + "x" + "+" + c;
						
			else if (b < 0 && c < 0)
				return "x^2" +  b + "x" + c;
			
			else if (b == 0 && c == 0)
				return "x^2" ;
			
			else if (b == 0 && c < 0)
				return "x^2" + c;
			
			else if (b == 0 && c > 0)
				return "x^2" + "+" + c;
			
			else if (b > 0 && c == 0)
				return "x^2" + "+" + b + "x";
			
			else if (b < 0 && c == 0)
				return "x^2" + b + "x";
			
			return "x^2" + "+" + b + "x" + "+" + c;
		}
		
		else {
			
			if (b > 0 && c > 0)
				return a + "x^2" + "+" + b + "x" + "+" + c; 
			
			else if (b > 0 && c < 0)
				return a + "x^2" + "+" + b + "x" + c;
			
			else if (b < 0 && c > 0)
				return a + "x^2" +  b + "x" + c;
						
			else if (b < 0 && c < 0)
				return "x^2" +  b + "x" + c;
			
			else if (b == 0 && c == 0)
				return "x^2" ;
			
			else if (b == 0 && c < 0)
				return "x^2" + c;
			
			else if (b == 0 && c > 0)
				return "x^2" + "+" + c;
			
			else if (b > 0 && c == 0)
				return "x^2" + "+" + b + "x";
			
			else if (b < 0 && c == 0)
				return "x^2" + b + "x";
			
			return a + "x^2" + "+" + b + "x" + "+" + c;
		}
	}
}
