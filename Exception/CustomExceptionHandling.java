package Exception;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}

public class CustomExceptionHandling {
	public static void checkAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Age is less than 18.");
		}
	}

	public static void main(String[] args) {
		try {
			checkAge(15);
		} catch (InvalidAgeException e) {
			System.err.println("Caught an InvalidAgeException: " + e.getMessage());
		}
	}
}
