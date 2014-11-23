
public class DogtoHuman {
	
	public int convertToHumanAge(int dogYears, int humanYears){
		
		if (dogYears == 1)
			return 13;
		else if (dogYears > 1)
			return (( 16 * (dogYears-1) / 3)  + 13);
		
		if (humanYears == 13)
			return 1;
		
		else if (humanYears > 13)
			return ( 16 / ((humanYears + 1) * 3) + 13);
		
		else 
			return 0;
	}
}
