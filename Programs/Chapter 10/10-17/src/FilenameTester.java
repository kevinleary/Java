import java.util.Scanner;
/*

Kevin Leary
Period 2
Date: 1/11/15 
Chapter: 10
Excercise: 17

*/
public class FilenameTester {

	public static void main(String[] args) {
		
		System.out.print("ENTER A FILENAME LESS THAN EIGHT CHARACTERS: ");
		Scanner sc = new Scanner(System.in);
		String filen = sc.next();
		
		FilenameTester f = new FilenameTester();
		System.out.println(f.validFileName(filen));
		
	}
	
	private String validFileName(String fileName){
		
		String ext = ".TXT";
		
		if (fileName.trim().length() >= 8
			&& fileName.indexOf(".") != 7){
			System.out.println("ILLEGAL AMOUNT OF CHARACTERS");
			return null;
		}

		else if (fileName.indexOf("?") >= 0
				|| fileName.indexOf(":") >= 0
				|| fileName.indexOf("*") >= 0){
			System.out.println("ILLEGAL CHARACTERS");
			return null;
		}
		else if (fileName.trim().indexOf(".") >= 7){
				fileName = fileName.substring(0, fileName.length() - 1);
			return fileName.toUpperCase();
		}
		else if (fileName.indexOf(".") >= 0 && fileName.indexOf(".") < 7){
			System.out.println("ILLEGAL CHARACTERS");
			return null;
		}
		
		else {
			return (fileName + ext).toUpperCase();
			
		}
			
		
	}

}
