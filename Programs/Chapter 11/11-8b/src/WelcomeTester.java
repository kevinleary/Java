/*

Kevin Leary
Period 2
Date: 2/10/14
Chapter: 11
Excercise: 8b

*/

//tester
public class WelcomeTester {
	
	public static void main(String args[]){
		
		WelcomeMessage eng = new WelcomeEnglish();
		WelcomeMessage spn = new WelcomeSpanish();
		WelcomeMessage frn = new WelcomeFrench();
		
		WelcomeTester t = new WelcomeTester();
		
		t.print(frn);
		t.print(eng);
		t.print(spn);
	}
	
	public void print(WelcomeMessage msg){
		
		System.out.println(msg.getWelcomeMessage());	//Uses the object of WelcomeMessage to print getWelcomeMessage
	}
}
