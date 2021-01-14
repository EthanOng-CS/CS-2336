/*
 * Ethan Ong 
 * ELO180000
 * 
 * June 15, 2020
 * 
 * This program will determine whether the second rectangle is inside 
 * the first or overlaps the first.
 * 
 */

import java.util.Scanner;

public class hw1_3dot28 {

	public static void main(String[] args) {

		// Takes the scanner of the users input
		Scanner inputReader = new Scanner(System.in);
		
		// Asks the user to enter rectangle 1 coordinates, width and height
		System.out.print("Enter r1's center x-, y- coordinates, width and height: ");
		double r1x = inputReader.nextDouble();
		double r1y = inputReader.nextDouble();
		double r1Width = inputReader.nextDouble();
		double r1Height = inputReader.nextDouble();
		
		//Asks the user to enter rectangle 2 coordinates, width and height
		System.out.print("Enter r2's center x-, y- coordinates, width and height: ");
		double r2x = inputReader.nextDouble();
		double r2y= inputReader.nextDouble();
		double r2Width = inputReader.nextDouble();
		double r2Height = inputReader.nextDouble();
		
		// If statement with calculation to see whether or not the rectangles is inside the first or overlaps the first.
		if((Math.pow(Math.pow(r2y - r1y, 2), .05) + r2Height / 2 <= r1Height / 2) &&
		  (Math.pow(Math.pow(r2x - r1x, 2), .05) + r2Width / 2 <= r1Width / 2)	 &&
		  (r1Height / 2 + r2Height / 2 <= r1Height) &&
		  (r1Width / 2 + r2Width / 2 <= r1Width)) {
			
			System.out.println("r2 is inside r1");
		}
		else if((r1x + r1Width / 2 > r2x - r2Width) || (r1y + r1Height / 2 > r2y - r2Height)) {
	
			System.out.println("r2 overlaps r1");
		}
		else
			System.out.println("r2 does not overlap r1");
	}

}
