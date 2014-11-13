
public class DogtoHuman {
	
	public int convertToHumanAge(int dogYears){
		
		if (dogYears == 1)
			return 13;
		else
			return (((dogYears-1) * 16) + 13);

	}
}
