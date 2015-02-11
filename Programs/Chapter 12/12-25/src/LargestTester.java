/*

Kevin Leary
Period 2
Date:  2/2/15
Chapter: 12 
Excercise: 25

*/
public class LargestTester {

	public static void main(String[] args) {
		
		double[][] arr = 
			{
				{6.0, 8.0, 3.0, 5.0},
				{7.0, 1.0, 1.0, 1.0},
				{5.0, 4.0, 2.0, 9.0}
			};
		
		//LargestTester lt = new LargestTester();
		
		System.out.print(LargestTester.positiveMax(arr));
		
	}
	
	private static double positiveMax(double[][] m)
	  {
	    double mMax = 0;
	    int rows = m.length, cols = m[0].length;

	    for (int r = 0; r < rows; r++)
	      for (int c = 0; c < cols; c++)
	        if (m[r][c] > mMax)
	          mMax = m[r][c];

	    return mMax;
	  }
}
