import java.util.ArrayList;
/*

Kevin Leary
Period 2
Date: 1/28/15 
Chapter: 12
Excercise: 15

*/
public class DuplicateTester {

	public static void main(String args[]) //main
	{
		ArrayList<String> words = new ArrayList<String>();
		
		words.add("yo");
		words.add("yo");
		words.add("whats");
		words.add("up");
		words.add("going");
		words.add("up");
		words.add("on");
		
		DuplicateTester r = new DuplicateTester();
		
		r.removeDuplicates(words);
 	}
	
	public void removeDuplicates(ArrayList<String> words){
		
		//tried to look this one up but i couldnt do it with for each syntax
		for(int i = 0; i < words.size(); i++)
		{
			for(int j = 0; j < words.size(); j++)
			{
				if((words.get(i) == words.get(j)) && i != j)
					words.remove(i);
			}
		}
		System.out.print(words);
	}

}
