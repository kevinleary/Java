
public class DogtoHuman {
	
	public int convertToHumanAge(int dogYears){
		
		if (dogYears == 1)
			return 13;
		else
			return (( 16 * (dogYears-1) / 3)  + 13);

	}
}
