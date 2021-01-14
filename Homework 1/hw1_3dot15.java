/*
 * Ethan Ong 
 * ELO180000
 * 
 * June 15, 2020
 * 
 * This program will determined whether the user wins the lottery.
 *  
 */

import java.util.Scanner;

public class hw1_3dot15 {

	public static void main(String[] args) {

		//Generates a 3-digit lottery number
		int lottery = (int)(Math.random() * 100);
		
		// Prompts the user to enter a 3-digit number
		Scanner inputReader = new Scanner(System.in);
		System.out.print("Enter your 3-digit lottery number: ");
		int userGuess = inputReader.nextInt();
		
		// Gets the numbers from the lottery
		int lotteryDig1 = lottery / 100;
		int lotteryDig2 = (lottery % 100) / 10;
		int lotteryDig3 = lottery % 10;
		
		// Gets the numbers from the guess
		int userGuessDig1 = userGuess / 100; 
		int userGuessDig2 = (userGuess % 100) / 10;
		int userGuessDig3 = userGuess % 10;
		
		// Prints the lottery number
		System.out.println("The lottery number is: " + lotteryDig1 + lotteryDig2 + lotteryDig3);
		
		// Checks the guess
		if (userGuess == lottery) {
			System.out.println("Congratulation, you win $10,000!");
		}
		else if ((userGuessDig1 == lotteryDig2 && userGuessDig2 == lotteryDig1 && userGuessDig3 == lotteryDig3)
			    || (userGuessDig1 == lotteryDig2
			      && userGuessDig1 == lotteryDig3 && userGuessDig3 == lotteryDig1)
			    || (userGuessDig1 == lotteryDig3
			      && userGuessDig2 == lotteryDig1 && userGuessDig3 == lotteryDig2)
			    || (userGuessDig1 == lotteryDig3
			      && userGuessDig2 == lotteryDig2 && userGuessDig3 == lotteryDig1)
			    || (userGuessDig1 == lotteryDig1
			      && userGuessDig2 == lotteryDig3 && userGuessDig3 == lotteryDig2)) {
			
			System.out.println("Congratulation, you win $3,000!");
		}
			   
		else if (userGuessDig1 == lotteryDig1 || userGuessDig1 == lotteryDig2
			    || userGuessDig1 == lotteryDig3 || userGuessDig2 == lotteryDig1
			    || userGuessDig2 == lotteryDig2 || userGuessDig2 == lotteryDig3
			    || userGuessDig3 == lotteryDig1 || userGuessDig3 == lotteryDig2
			    || userGuessDig3 == lotteryDig3) {
			
			   System.out.println("Congratulation, you win $1000! ");
		}   
		else
			System.out.println("Sorry, you did not win the lottery");
	}

}
