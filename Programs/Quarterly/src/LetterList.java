
public class LetterList {
	
	public char AlphabetEnd(char let){
		
		if(let == 91) //set to asci Value also... base case
			return 'Z'; 
		
		else {
			char c = Character.toUpperCase(let); 
			System.out.print(c); 
			
			return AlphabetEnd((char)(c + 1)); //recursive statement
			
		}
	}

}
