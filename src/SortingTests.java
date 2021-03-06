import java.util.Arrays;
import java.util.Scanner;

public class SortingTests {

	// Extra Credit Recursive (Palindromes)
	static boolean algorith(String str) {
		str = str.toLowerCase();
		// System.out.println("hi");
		if (str.length() == 0 || str.length() == 1) {
			return true;
		} else {
			String a = str.substring(0, 1);
			String b = str.substring(str.length() - 1, str.length());
			return a.equals(b) && algorith(str.substring(1, str.length() - 1));
		}
	}

	// Extra Credit 2
	static boolean algorithl(String str) {
		if (str.length() > 1) {
			int max = str.length() / 2;
			for (int i = 0; i < max; i++) {
				// System.out.println("lo");
				if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
					return false;
				}
			}
			return true;
		}
		// return false; <-- PROBLEM
		return true;
	}

	// InsertionSort
	static void insertionSort(int[] array) {
		for (int i = 0; i < array.length; i++) { // for each item in the array
			for (int j = array.length - 1; j > i; j--) { // for each item after
															// i
				System.out.println(Arrays.toString(array));
				if (array[j] < array[j - 1]) {// if j is less than its left
												// neighbor
					swap(array, j, j - 1);// swap j and its left neighbor
				}
			}
			System.err.println(i + "\n\n");
		}
	}

	// Selective Sorting
	static void selectiveSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) { // For each element in the
														// array
			int smallestIndex = i; // Assume that the first value is the
									// smallest
			for (int j = i + 1; j < array.length; j++) { // For every value
															// after i...
				if (array[smallestIndex] > array[j]) { // If the item at j is
														// smaller than at i
					smallestIndex = j; // J is the smallest number
				}

			}
			swap(array, smallestIndex, i);
		}
	}

	// default swap method
	static void swap(int[] array, int a, int b) {
		if (a >= array.length || b >= array.length) {
			return;
		}
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

	public static void main(String[] args) {
		while (true) {
			Scanner reader = new Scanner(System.in);
			System.out.println("Enter a Word: ");
			String input = reader.next();
			if (algorith(input)) {
				System.out
						.println("========================\nThis is a Palindrome\n========================");
			} else if (input.equalsIgnoreCase("exit")) {
				return;

			} else {
				System.out
						.println("======================\nThis is not a Palindrome\n======================");
			}
		}
	}

}
