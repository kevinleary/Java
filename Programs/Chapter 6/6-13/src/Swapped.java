
public class Swapped {
	
	private int numb;

	public Swapped(int n){
		
		numb = n;
	}
	
	public void Swapper(){
								// if numb is 123
		int a = numb / 100;     // gives 1
		int b = numb % 100 % 10; // gives 3
		int c = numb % 100 / 10; //gives 2

		
		System.out.println("Your number with the tens and ones swapped is " + a + b + c);
	}
}
