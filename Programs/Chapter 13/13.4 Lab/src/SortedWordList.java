import java.util.ArrayList;
/*

Kevin Leary
Period 2
Date: 2/18/14
Chapter: 13
Excercise: LAB

*/

public class SortedWordList extends java.util.ArrayList<String>{
	
	private int cap;
	
	public SortedWordList(){
		
		super();
	}
	
	public SortedWordList(int c){
		//cap = c;
		super(c);
	}

	public void merge(SortedWordList additionalWords) {
		
		int i = size() - 1;
		int j = additionalWords.size() - 1;
		addAll(additionalWords);
		int k = size() -1;
		
		while (j >= 0)
		{
			if (i < 0 || get(i).compareToIgnoreCase(additionalWords.get(j)) < 0)
			{
				super.set(k, additionalWords.get(j));
				j--;
			}
			
			else
			{
				super.set(k, get(i));
				i--;
			}
			k--;
		}
		
	}
	
	public boolean contains(String word){
		
		
		return (indexOf(word) >= 0);
	}
	
	public int indexOf(String word){		//add binary search
		
		int left = 0, right = size() - 1;
		
		while (left <= right)
		{
			int middle = (left + right) / 2;
			
			int diff = word.compareToIgnoreCase(get(middle));
			
			if (diff > 0)
				left = middle + 1;
			
			if (diff < 0)
				right = middle -1;
			
			else
				return middle;
		}
		
		return -1;
	}
	
	public String set(int i, String word){
		
		if((i > 0 && word.compareToIgnoreCase(get(i -1)) <= 0 ) || (i < size() - 1 && 
				word.compareToIgnoreCase(get(i + 1)) >= 0 ))
		
			throw new IllegalArgumentException("word = " + word + " i=" + i);
			
			return super.set(i,word);
	} 
	
	public void add(int i, String word){
		
		super.add(i, word);
		
	}
	
	public boolean add(String word){
		
		//unimplemented code ? the code is commented out?
		
		return super.add(word);
	}
	
	
}
