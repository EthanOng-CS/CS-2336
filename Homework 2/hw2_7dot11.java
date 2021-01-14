import java.util.Scanner;

public class hw2_7dot11 {
	public static void main(String[] args) {
		Scanner inputReader = new Scanner(System.in); 
		double[] numbers = new double[10]; // Create a length of 10 in the array

		// Prommpts the user to enter 10 numbers
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = inputReader.nextDouble();

		// Outputs the mean and standard deviation
		System.out.printf("The mean is %.2f", mean(numbers));
		System.out.printf("\nThe standard deviation is %.5f", deviation(numbers));
	}

	// Calculates the deviation of double values 
	public static double deviation(double[] x) {
		double standardDeviation = 0;
		double mean = mean(x);
		for (int i = 0; i < x.length; i++) {
			standardDeviation += Math.pow((x[i] - mean), 2);
		}
		return Math.sqrt(standardDeviation / (x.length - 1));
	}

	// Caculates the mean 
	public static double mean(double[] x) {
		double mean = 0;
		for (int i = 0; i < x.length; i++) {
			mean += x[i];
		}
		return mean / x.length;
	}
}