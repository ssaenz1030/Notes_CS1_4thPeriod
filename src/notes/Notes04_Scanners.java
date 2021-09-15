package notes;

import java.util.Scanner;

/*
 * Scanners
 *   Getting input from a user or file
 *   
 * Must have at top
 *   import java.util.Scanner;
 *   
 *   
 * Methods
 *   .nextLine() = grabs a line of text
 *   .nextInt() = grabs the next integer
 *   .nextDouble() = grams the next double
 *   
 *   
 * Burning a Line
 * 
 * 
 *   
 */

public class Notes04_Scanners {

	public static void main(String[] args) {
		
		Scanner inKey = new Scanner(System.in);  //creates the scanner object (only once)
		
		System.out.print("What city are you from? ");  //prompt the user
		String userInput = inKey.nextLine();  //scan until user hits enter
		
		System.out.println("Your from " + userInput + "?");
		
		
		
		System.out.print("What's your favorite condoment? ");
		String userPreference = inKey.nextLine();
		System.out.println(userPreference);
		
		
		
		System.out.print("How old are you? ");
		int userAge = inKey.nextInt();
		System.out.println(userAge);
		
		int userBirthYear = 2021 - userAge;
		System.out.println("You were born in " + userBirthYear);
		
		
		
		
		
		
		
		
		
	}
	
	
}
