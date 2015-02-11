/*

Kevin Leary
Period 2
Date:  1/31/15
Chapter: 12 
Excercise: 18

*/

public class MedianTester {
	
	public static void main(String args[]) //main
	{
		double[] sample = {14.0, 13.0, 10.0, 8.0, 14.0, 9.0, 9.0};
		double m = 10;
		
		MedianTester mt = new MedianTester();
		System.out.print(mt.isMedian(sample, m));
 	}
	
	public boolean isMedian(double[] sample, double m ){
		
		int small = 0;
		int big = 0;
		
		for(int i = 0; i < sample.length; i++)	//iterates through the length of the array and the values
		{
			if(sample[i] < m)
				small++;
			else if(sample[i] > m)
				big++;
		}
		
		if(small == big)
			return true;
		else
			return false;
	}
}
