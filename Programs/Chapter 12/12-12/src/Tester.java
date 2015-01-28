import java.util.ArrayList;
/*

Kevin Leary
Period 2
Date: 1/27/15 
Chapter: 12
Excercise: 12

*/
public class Tester {
	
	public static void main(String[] args){
	
	ArrayList<String> list = new ArrayList<String>();
	list.add("Cat");
	list.add("Dog");
	list.add("Fish");
	

	System.out.println(list);
	
	
	Tester t = new Tester();
	
	System.out.println(t.reverse(list));
}

	public ArrayList<String> reverse(ArrayList<String> list)
	{
		ArrayList<String> reversed = new ArrayList<String>(list.size());
		for (int i = list.size() - 1; i >= 0; i--)
			reversed.add(list.get(i));
		return reversed;
	}
}