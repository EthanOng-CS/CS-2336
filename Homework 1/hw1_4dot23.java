/*
 * Ethan Ong 
 * ELO180000
 * 
 * June 15, 2020
 * 
 * This program will print a payroll statement.
 * 
 */

import java.util.Scanner;

public class hw1_4dot23 {

	public static void main(String[] args) {

		Scanner inputReader = new Scanner(System.in);
		
		// Prompt the user to enter payroll information
		System.out.print("Enter employee’s name: ");
		String name = inputReader.next();	
		System.out.print("Enter number of hours worked in a week: ");
		double hoursWorked = inputReader.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		double hourlyPayRate = inputReader.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		double federalTaxRate = inputReader.nextDouble();
		System.out.print("Enter state tax withholding rate: ");
		double stateTaxRate = inputReader.nextDouble();

		// Calculations
		double grossPay = hoursWorked * hourlyPayRate;
		double state = grossPay * stateTaxRate;
		double federal = grossPay * federalTaxRate;
		double totalDeduction = federal + state;
		double netPay = grossPay - totalDeduction;
		
		state = state * 100;
		int stateInt = (int) state;
		state = (double) stateInt;
		state = state / 100;		
		
		totalDeduction = totalDeduction * 100;
		int totalDeductionInt = (int) totalDeduction;
		totalDeduction = (double) totalDeductionInt;
		totalDeduction = totalDeduction / 100;
		
		netPay = netPay * 100;
		int netPayInt = (int) netPay;
		netPay = (double) netPayInt;
		netPay = netPay / 100;
		
		// Display payroll statement
		System.out.println("\nEmployee Name: " + name);
		System.out.println("Hours Worked: " + hoursWorked);
		System.out.println("Pay Rate: $" + hourlyPayRate);
		System.out.println("Gross Pay: $" + grossPay);
		System.out.println("Deductions:");
		System.out.printf("\tFederal Witholding (" + federalTaxRate * 100 + "%%): $%.1f", federal);
		System.out.printf("\n\tState Witholding (" + stateTaxRate * 100 + "%%): $%.2f", state);
		System.out.printf("\n\tTotal Deduction: $%.2f", totalDeduction);
		System.out.printf("\nNet Pay: $%.2f", netPay);
					
	}

}

