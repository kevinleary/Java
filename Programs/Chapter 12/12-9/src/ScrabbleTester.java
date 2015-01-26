import java.util.Scanner;
/*

Kevin Leary
Period 2
Date: 1/19/15 
Chapter: 12
Excercise: 9

*/
public class ScrabbleTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word to see how many points in scrabble you would get: ");
		String word = sc.next();
		ScrabbleTester t = new ScrabbleTester();
		System.out.println("Your total SCRABBLE SCORE is: " + t.computeScore(word));

	}
	
	public int computeScore(String word){
		
		int score[] = {1, 3, 3, 2, 	//a, b, c, d
						1, 4, 2, 4,	//e, f, g, h
						1, 8, 5, 1,	//i, j, k, l
						3, 1, 3, 3,	//m, n, o, p
						10, 1, 1, 1, //q, r, s, t
						1, 4, 4,	//u, v, w
						8, 4, 10};	//x, y, z
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		
		int scoretot = 0;
		
		for (int i = 0; i < word.length(); i++){
			
			scoretot = scoretot + score[alphabet.indexOf(word.charAt(i))];
		}
		return scoretot;
	}
}
