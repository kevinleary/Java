import java.util.Scanner;
/*

Kevin Leary
Period 2
Date: 11/12/14
Excercise: QUARTERLY

*/
public class  AlphabetSoupTester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("WELCOME TO THE ALPHABET(?) PROGRAM...");
		System.out.println("You will be able to select between ...");
		System.out.println("1. Entering a letter and it will show you how many letters till 'Z'");
		System.out.println("2. Entering a word and it will tell you if it is a PALINDROME");
		System.out.println("3. Printing my initials- KNL- any having your choice of two in super BIG letters");
		System.out.println("4. Printing huge letters A and B");
		System.out.println("Which option will you choose?");
		
		System.out.print("Enter 1, 2, 3, or 4 for the option you want to happen: ");
		int o = sc.nextInt();
		

		if ( o ==  1){
			System.out.println("You picked option " + o + "! Initiating Class LetterList...");
			
			System.out.print("Please enter a letter: ");
			char c = sc.next().charAt(0);
			LetterList l = new LetterList();
			l.AlphabetEnd(c);
			System.out.println();
		}
		

		 if( o ==  2){
			System.out.println("You picked option " + o + "! Initiating Class PalindromePal...");
		
			System.out.print("Please enter a word: ");
			String w = sc.next();
			char [] pal = w.toCharArray();		// convert the string to an array
			
			PalindromePal p = new PalindromePal();
			
			p.checkPalindrome(pal);
			
			if (p.checkPalindrome(pal) == true)		//returns true or false... boolean method
				System.out.println("Your word was a PALINDROME!");
			
			else
				System.out.print("Sorry your word was not a PALINDROME! ");
		}


		 if ( o ==  3){
			System.out.println("You picked option " + o + "! Initiating Class MyInitials...");
			
			System.out.println("Enter k for k, n for n, and l for l");
			System.out.print("Kindly enter the first letter you want to appear BIG: ");
			char l1 = sc.next().charAt(0);
			
			System.out.print("Now enter the second letter you want to appear BIG: ");
			char l2 = sc.next().charAt(0);
			
			MyInitials g = new MyInitials();
			
			
			String kBlk[] = new String[9];		//creates k block array... All initialized with a loop
			for (int i =0; i <9; i++)
				kBlk[i] = g.printK(i);
			

			String nBlk[] = new String[9];		//creates n block array
			for (int i =0; i <9; i++)
				nBlk[i] = g.printN(i);
			

			String lBlk[] = new String[9];		//creates l block array
			for (int i =0; i <9; i++)
				lBlk[i] = g.printL(i);
			
			if(l1 == 'k' && l2 == 'n')
			{

				System.out.println(kBlk[0]+"   "+nBlk[0]);
				System.out.println(kBlk[1]+"   "+nBlk[1]);
				System.out.println(kBlk[2]+"   "+nBlk[2]);
				System.out.println(kBlk[3]+"   "+nBlk[3]);
				System.out.println(kBlk[4]+"   "+nBlk[4]);
				System.out.println(kBlk[5]+"   "+nBlk[5]);
				System.out.println(kBlk[6]+"   "+nBlk[6]);
				System.out.println(kBlk[7]+"   "+nBlk[7]);
				System.out.println(kBlk[8]+"   "+nBlk[8]);
				}
			else if(l1 =='k' && l2 == 'l')
			{
				System.out.println(kBlk[0]+"   "+lBlk[0]);
				System.out.println(kBlk[1]+"   "+lBlk[1]);
				System.out.println(kBlk[2]+"   "+lBlk[2]);
				System.out.println(kBlk[3]+"   "+lBlk[3]);
				System.out.println(kBlk[4]+"   "+lBlk[4]);
				System.out.println(kBlk[5]+"   "+lBlk[5]);
				System.out.println(kBlk[6]+"   "+lBlk[6]);
				System.out.println(kBlk[7]+"   "+lBlk[7]);
				System.out.println(kBlk[8]+"   "+lBlk[8]);
				
			}
			else if(l1 == 'n' && l2 == 'k')
			{
				System.out.println(nBlk[0]+"   "+kBlk[0]);
				System.out.println(nBlk[1]+"   "+kBlk[1]);
				System.out.println(nBlk[2]+"   "+kBlk[2]);
				System.out.println(nBlk[3]+"   "+kBlk[3]);
				System.out.println(nBlk[4]+"   "+kBlk[4]);
				System.out.println(nBlk[5]+"   "+kBlk[5]);
				System.out.println(nBlk[6]+"   "+kBlk[6]);
				System.out.println(nBlk[7]+"   "+kBlk[7]);
				System.out.println(nBlk[8]+"   "+kBlk[8]);
			}
			else if(l1 == 'n' && l2 == 'l')
			{
				System.out.println(nBlk[0]+"   "+lBlk[0]);
				System.out.println(nBlk[1]+"   "+lBlk[1]);
				System.out.println(nBlk[2]+"   "+lBlk[2]);
				System.out.println(nBlk[3]+"   "+lBlk[3]);
				System.out.println(nBlk[4]+"   "+lBlk[4]);
				System.out.println(nBlk[5]+"   "+lBlk[5]);
				System.out.println(nBlk[6]+"   "+lBlk[6]);
				System.out.println(nBlk[7]+"   "+lBlk[7]);
				System.out.println(nBlk[8]+"   "+lBlk[8]);
			}
			else if(l1 == 'l' && l2 == 'k')
			{
				System.out.println(lBlk[0]+"   "+kBlk[0]);
				System.out.println(lBlk[1]+"   "+kBlk[1]);
				System.out.println(lBlk[2]+"   "+kBlk[2]);
				System.out.println(lBlk[3]+"   "+kBlk[3]);
				System.out.println(lBlk[4]+"   "+kBlk[4]);
				System.out.println(lBlk[5]+"   "+kBlk[5]);
				System.out.println(lBlk[6]+"   "+kBlk[6]);
				System.out.println(lBlk[7]+"   "+kBlk[7]);
				System.out.println(lBlk[8]+"   "+kBlk[8]);
				
			} 
			else if(l1 == 'l' && l2 == 'n')
			{
				System.out.println(lBlk[0]+"   "+nBlk[0]);
				System.out.println(lBlk[1]+"   "+nBlk[1]);
				System.out.println(lBlk[2]+"   "+nBlk[2]);
				System.out.println(lBlk[3]+"   "+nBlk[3]);
				System.out.println(lBlk[4]+"   "+nBlk[4]);
				System.out.println(lBlk[5]+"   "+nBlk[5]);
				System.out.println(lBlk[6]+"   "+nBlk[6]);
				System.out.println(lBlk[7]+"   "+nBlk[7]);
				System.out.println(lBlk[8]+"   "+nBlk[8]);
			}
			else if(l1 == 'k' && l2 == 'k')
			{
				System.out.println(kBlk[0]+"   "+kBlk[0]);
				System.out.println(kBlk[1]+"   "+kBlk[1]);
				System.out.println(kBlk[2]+"   "+kBlk[2]);
				System.out.println(kBlk[3]+"   "+kBlk[3]);
				System.out.println(kBlk[4]+"   "+kBlk[4]);
				System.out.println(kBlk[5]+"   "+kBlk[5]);
				System.out.println(kBlk[6]+"   "+kBlk[6]);
				System.out.println(kBlk[7]+"   "+kBlk[7]);
				System.out.println(kBlk[8]+"   "+kBlk[8]);
				
			}
			else if(l1 == 'n' && l2 == 'n')
			{
				System.out.println(nBlk[0]+"   "+nBlk[0]);
				System.out.println(nBlk[1]+"   "+nBlk[1]);
				System.out.println(nBlk[2]+"   "+nBlk[2]);
				System.out.println(nBlk[3]+"   "+nBlk[3]);
				System.out.println(nBlk[4]+"   "+nBlk[4]);
				System.out.println(nBlk[5]+"   "+nBlk[5]);
				System.out.println(nBlk[6]+"   "+nBlk[6]);
				System.out.println(nBlk[7]+"   "+nBlk[7]);
				System.out.println(nBlk[8]+"   "+nBlk[8]);
			} 
			else if(l1 == 'l' && l2 == 'l')
			{
				System.out.println(lBlk[0]+"   "+lBlk[0]);
				System.out.println(lBlk[1]+"   "+lBlk[1]);
				System.out.println(lBlk[2]+"   "+lBlk[2]);
				System.out.println(lBlk[3]+"   "+lBlk[3]);
				System.out.println(lBlk[4]+"   "+lBlk[4]);
				System.out.println(lBlk[5]+"   "+lBlk[5]);
				System.out.println(lBlk[6]+"   "+lBlk[6]);
				System.out.println(lBlk[7]+"   "+lBlk[7]);
				System.out.println(lBlk[8]+"   "+lBlk[8]);
			}
		}


		 if ( o ==  4){
			System.out.println("You picked option " + o + "! Initiating Class MyInitials (Again)...");
			
			System.out.println("A and B will now appear huge on your screen!!!");
			
			MyInitials z = new MyInitials();		//stored in same class as my initials
			
			
			String aBlk[] = new String[9];		//creates a block array... All initialized with a loop
			for (int i =0; i <9; i++)
				aBlk[i] = z.printA(i);
			

			String bBlk[] = new String[9];		//creates b block array
			for (int i =0; i <9; i++)
				bBlk[i] = z.printB(i);

			System.out.println(aBlk[0]+"   "+bBlk[0]);
			System.out.println(aBlk[1]+"   "+bBlk[1]);
			System.out.println(aBlk[2]+"   "+bBlk[2]);
			System.out.println(aBlk[3]+"   "+bBlk[3]);
			System.out.println(aBlk[4]+"   "+bBlk[4]);
			System.out.println(aBlk[5]+"   "+bBlk[5]);
			System.out.println(aBlk[6]+"   "+bBlk[6]);
			System.out.println(aBlk[7]+"   "+bBlk[7]);
			System.out.println(aBlk[8]+"   "+bBlk[8]);	
		}
		
		else 
			
			
		System.out.println("Thank you for participating in THE GREAT ALPHABET PROGRAM!");

	}
}

