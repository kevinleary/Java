
public class Odds {

	int addOdds(int n){
		int sum = 0;
		
		for (int i = 1; i <= n; i+=2){		// i += 2 iterates to every odd number in the integer
			sum = sum + i;
		}
		return sum;
	}
}
