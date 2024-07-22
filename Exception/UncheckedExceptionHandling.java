package Exception;

import java.util.Scanner;

public class UncheckedExceptionHandling {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter the numerator: ");
			int numerator = scanner.nextInt();
			System.out.print("Enter the denominator: ");
			int denominator = scanner.nextInt();
			int result = numerator / denominator;
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.err.println("An ArithmeticException occurred: Division by zero is not allowed.");
		}
	}
}
