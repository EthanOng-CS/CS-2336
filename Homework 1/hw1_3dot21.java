/*
 * Ethan Ong 
 * ELO180000
 * 
 * June 15, 2020
 * 
 * This program will calculate the day of the week.
 * 
 */

import java.util.Scanner;

public class hw1_3dot21 {

	public static void main(String[] args) {

		// Create a scanner class object to get the inputs from the user
		Scanner inputReader = new Scanner(System.in);
		
		// Declaring the variables for days, month, year, century, years of the century
		int k, m, q, j, h;
		String day[] = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
		
		// Getting the input entered by the user
		System.out.print("Enter Year: (e.g., 2012): ");
		k = inputReader.nextInt();
		System.out.print("Enter Month: 1-12: ");
		m = inputReader.nextInt();
		System.out.print("Enter Day: 1-31: ");
		q = inputReader.nextInt();
		
		// is the user input enter 1 for January or 2 for February 
		if(m == 1 || m == 2) {
			m = m + 12;
			k = k -1;
		}
		
		// Calculation to get the century and the year of the century
		j = k / 100;
		k = k % 100;
		
		// Calculating the day of the week
		h = (q + 26 * ( m + 1 ) / 10 + k + k / 4 + j / 4 + 5 * j)% 7;
		
		// Display the output
		System.out.println("Day of the week is " + day[h]);
	}

}
