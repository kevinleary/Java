
public class PalindromePal {

	 public boolean checkPalindrome(char[] pal){		//made it a boolean to check 
		 
		 	int i = 0;
		    int j = pal.length - 1;
		    
		    while (j > i) {
		        if (pal[i] != pal[j]) {		//if the characters to not match up it returns false
		            return false;
		        }
		        
		        ++i;		//iteration to keep the incrementing up the word
		        --j;
		    }
		    
		    return true;
	 }
}
