import java.util.Scanner;

public class hw2_7dot19 {
	public static void main(String[] args) {
		Scanner inputReader = new Scanner(System.in);

		// Prompts the user to enter a list
		System.out.print("Enter list: ");
		int[] list = new int[inputReader.nextInt()];
		for (int i = 0; i < list.length; i++)
			list[i] = inputReader.nextInt();

		// Outputs the list if it is already sorted or not sorted 
		System.out.println(
			"The list is " + (isSorted(list) ? "already " : "not ") + "sorted");
	}

	public static boolean isSorted(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			if (list[i] > list[i + 1])
				return false;
		}
		return true;
	}
}