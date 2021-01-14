/*
 * Ethan Ong 
 * ELO180000
 * 
 * June 15, 2020
 * 
 * This program will display the number of days in the month.
 * 
 */

import java.util.Scanner;

public class hw1_4dot17 {

	public static void main(String[] args) {

		// Prompt the user to pick a year and a month
		Scanner inputReader = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = inputReader.nextInt();
		System.out.print("Enter a month: ");
		String month = inputReader.next();
		
		// Determines if it is going to be a leap year
		boolean leapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
		
		// If statement to display how many days it has in the particular month
		if (month.equals("Jan") || month.equals("Mar") || 
			month.equals("May") || month.equals("Jul") ||
			month.equals("Aug") || month.equals("Oct") ||
			month.equals("Dec")) {
			
				System.out.println(month + " " + year + " has " + 31 + " days");
		}
		else if (month.equals("Apr") || month.equals("Jun") || 
				 month.equals("Sep") || month.equals("Nov")) {
			
				System.out.println(month + " " + year + " has " + 30 + " days");
		}
			else
				System.out.println(month + " " + year + " has " + ((leapYear) ? 29 : 28) + " days");	
	}

}
