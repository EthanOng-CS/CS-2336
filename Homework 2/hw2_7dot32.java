import java.util.Scanner;

public class hw2_7dot32 {
	public static void main(String[] args) {
		Scanner inputReader = new Scanner(System.in);
		
		// Prompts the user to enter a list
		System.out.print("Enter list: ");
		int[] list = new int[inputReader.nextInt()];
		
		for (int i = 0; i < list.length; i++) {
			list[i] = inputReader.nextInt();
		}
   
		partition(list);
	   
	    System.out.print("After the partition, the list is ");
	   
	    for (int i = 0; i < list.length; i++) {
	    	System.out.print(list[i] + " ");
	    }
	}
	
	public static int partition(int[] list1) {
		int pivot = list1[0];
		int pi = 1;
		int p;
		
		// Swapping elements so it can go on the left side of pivot
		for(int i = 1; i < list1.length; i++)
		{
			if(list1[i] < pivot)
			{
				p = list1[i];
				list1[i] = list1[pi];
				list1[pi] = p;
				pi++;
			}
		}
		
		// Place pivot in the correct position
		p = list1[0];
		list1[0] = list1[pi-1];
		list1[pi-1] = p;
		return pi-1;
	}
}

