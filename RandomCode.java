import java.util.Scanner;

public class RandomCode {

	// Function that verifies if the given string is sorted (unicode char-wise).
	public static boolean isSorted(String text) {
		int index = 0;
		while (index < text.length() - 1) {
			char current = text.charAt(index++);
			char next = text.charAt(index);
			if (current > next) {
				return false;
			}
		}
		return true;
	}

	// Verbose utility that tests and reports to the user if a given String is
	// sorted.
	public static void test(String letters) {
		System.out.println("Is " + letters + " sorted?");
		boolean sorted = isSorted(letters);
		System.out.println(sorted);
	}

	public static void main(String[] args) {
		// Verify if a known sorted String is sorted
		test("abcdefg");

		// Ask the user for letters
		System.out.println("Give me a sequence of character to verify:");
		Scanner scanner = new Scanner(System.in);
		test(scanner.next());

		System.out.println("Program Done");
	}

}