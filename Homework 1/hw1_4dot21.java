/*
 * Ethan Ong 
 * ELO180000
 * 
 * June 15, 2020
 * 
 * This program will determined whether the users input
 * for the social security number is valid.
 * 
 */

import java.util.Scanner;

public class hw1_4dot21 {

	public static void main(String[] args) {
		
		Scanner inputReader = new Scanner(System.in);

		// Prompt the user to enter a Social Security number
		System.out.print("Enter a SSN: ");
		String ssn = inputReader.next();

		// Check if input us valid
		boolean valid = 
			(ssn.length() == 11) && 
			(Character.isDigit(ssn.charAt(0))) &&
			(Character.isDigit(ssn.charAt(1))) &&
			(Character.isDigit(ssn.charAt(2))) &&
			(ssn.charAt(3) == '-') &&
			(Character.isDigit(ssn.charAt(4))) &&
			(Character.isDigit(ssn.charAt(5))) &&
			(Character.isDigit(ssn.charAt(7))) &&
			(ssn.charAt(6) == '-') &&
			(Character.isDigit(ssn.charAt(8))) &&
			(Character.isDigit(ssn.charAt(9))) &&
			(Character.isDigit(ssn.charAt(10)));

		// Display result
		System.out.println(ssn + " is " + ((valid) ? "a valid " : "an invalid ")
			+ "social security number");
	}

}
