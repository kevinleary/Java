
public class Square {

	public static boolean isPerfectSquare(int n){
		//int k =0;
		int sum =0;
		
		for (int i = 1; i <= n; i+=2){

			
			if (sum >= n){
				//sum+=2;
				break;
			}
			//k++
			sum +=i;

		}
		
		if(n == sum)
			return true;
		else 
			return false;
	}
}
