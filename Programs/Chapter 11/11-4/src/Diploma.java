/*

Kevin Leary
Period 2
Date: 2/5/14
Chapter: 11
Excercise: 4

*/

public class Diploma {
	private String name, degree;
	
	public static void main(String[] args) {
		Diploma d1 = new Diploma("Ryan Scoopo", "Animal Behavior");
		Diploma d2 = new DiplomaWithHonors("Kevin Leary", "Computer Science");
		
		System.out.print(d1);
		System.out.println();
		System.out.println();
		System.out.println(d2);
	}
	
	public Diploma(String n, String d){
		name = n;
		degree = d;
	}

	public String toString(){
		return "This certifies that \n" + name + "\nhas completed a course in " + degree;
	}
}
