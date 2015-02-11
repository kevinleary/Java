import java.util.ArrayList;
/*

Kevin Leary
Period 2
Date: 1/28/15 
Chapter: 12
Excercise: 14

*/
public class CompareTester {

	public static void main(String[] args) {
		
		ArrayList<Object> list1 = new ArrayList<Object>();
		ArrayList<Object> list2 = new ArrayList<Object>();
		
		list1.add(9);
		list1.add(6);
		list1.add(3);
		
		list2.add(4);
		list2.add(3);
		list2.add(2);
		
		
		CompareTester c = new CompareTester();
		
		c.filter(list1, list2);
	}
	
	public void filter(ArrayList<Object> list1, ArrayList<Object> list2){
		
		for (Object i : list1){
			for (Object j : list2){
				if (i == j){
					list1.remove(i);		//this throws an error and i really dont know how to fix it
				}							//has to do something with the iteration and remove 
			}
		}
		System.out.println(list1);
	}
}
