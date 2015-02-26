/*

Kevin Leary
Period 2
Date: 2/23/14
Chapter: 13
Excercise: 2

*/
public class Person implements Comparable<Person>{
	
	private String firstname, lastname;
	
	public Person(String f, String l){
		firstname = f;
		lastname = l;
	}
	
	public int compareTo(Person other){
		    
		int diff = getLastName().compareTo(other.getLastName());

		if (diff == 0)
		    diff = getFirstName().compareTo(other.getFirstName());
		return diff;
	}
	
	public String getFirstName(){
		
		return firstname;
	}
	
	public String getLastName(){
		
		return lastname;
	}
	
	
}
