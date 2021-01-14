/*
 * Ethan Ong 
 * ELO180000
 * 
 * June 15, 2020
 * 
 * This program will find the root using the quadratic equation.
 * 
 */

import java.util.Scanner;

public class hw1_3dot1 {

	public static void main(String[] args) {
		double a, b, c; 
		
		// Gets the input from the user for a, b, & c
		Scanner inputReader = new Scanner(System.in);
		System.out.print("Enter 3 numbers separated by space: ");
		a = inputReader.nextDouble();
		b = inputReader.nextDouble();
		c = inputReader.nextDouble();
		
		// equation b^2 - 4ac
		double discriminant = b * b - 4 * a * c;
		
		// sets the output to see if the numbers input will have a root or not
		if(discriminant < 0) {
			System.out.println("The equation has no real roots");
		}
		else if (discriminant == 0) {
			double r1 = -b / (2 * a);
			System.out.printf("The equation has one root %.0f", r1);
		}
		else {// discriminant > 0
			double r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
			double r2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
			System.out.printf("The equation has two roots %.6f and %.5f", r1, r2 );
		}
	}
}

