import java.util.ArrayList;
/*

Kevin Leary
Period 2
Date: 1/28/15 
Chapter: 12
Excercise: 13

*/
public class SmallerTester {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(9);
		list.add(4);
		list.add(3);
		list.add(7);
		list.add(1);
		
		System.out.println(list);
		
		SmallerTester s = new SmallerTester();
		
		s.smaller(list);
		

	}
	
	public void smaller(ArrayList<Integer> list){
		
		int temp = list.get(0);
		int index = 0;
		
		for (int i = 0; i < list.size(); i++){
			
			if (list.get(i) < temp){
				index = i;
				temp = list.get(i);
				
			}
		}
		list.remove(index);
		
		System.out.println(list);
	}
}
