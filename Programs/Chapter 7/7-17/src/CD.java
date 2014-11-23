
public class CD {
	
	public int findBestFit(int size1, int size2, int space){
		
		int fit=0; 
		
		if (size1 == size2)
			fit += 1;
		
		else if ((size1 + size2) <= space)
			fit+=3;
		
		else
			fit = 0;
		
		return fit;
		
	}

}
