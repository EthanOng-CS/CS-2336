public class hw_10dot6 {

	public static void main(String[] args) {
		// Create a StackOfIntegers
		StackOfIntegers stack = new StackOfIntegers();

		// Find and put all prime numbers that are less than 120 to stack
		for (int i = 2; i < 120; i++) {
			if (isPrime(i))
				stack.push(i);
		}

		// Outputs all the prime numbers less than 120 in decreasing order
		System.out.println(
			"All prime numbers that are less\nthan 120 in decreasing order:\n");
		while (!stack.empty()) {
			System.out.print(stack.pop() + "\n");
		}
		System.out.println();
	}

	// Returns true if n is a Prime number
	public static boolean isPrime(int n) {
		for (int d = 2; d <= n / 2; d++) {
			if (n % d == 0) 
				return false;
		}
		return true;
	}
}
class StackOfIntegers {
	private int[] numElement;
	private int size;
	public static final int CAPACITY = 16;

	// Construct a stack with capacity of 16
	public StackOfIntegers() {
		this (CAPACITY);
	}

	// Construct a stack with maximum capacity 
	public StackOfIntegers(int capacity) {
		numElement = new int[capacity];
	}

	// Puts new integer to the beginning of stack 
	public void push(int value) {
		if (size >= numElement.length) {
			int[] temp = new int[numElement.length * 2];
			System.arraycopy(numElement, 0, temp, 0, numElement.length);
			numElement = temp;
		}

		numElement[size++] = value;
	}

	// Return and remove the beginning element from stack 
	public int pop() {
		return numElement[--size];
	}

	// Returns top element 
	public int peek() {
		return numElement[size - 1];
	}

	// Test to see if the stack is empty or not 
	public boolean empty() {
		return size == 0;
	}

	// Returns numbers of elements 
	public int getSize() {
		return size;
	}
}