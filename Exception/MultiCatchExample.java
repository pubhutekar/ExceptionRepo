package Exception;

import java.io.FileReader;
import java.io.IOException;

public class MultiCatchExample {
	public static void processFile(String filename) throws IOException, IllegalArgumentException {
		if (filename == null || filename.isEmpty()) {
			throw new IllegalArgumentException("Filename cannot be null or empty");
		}

		try (FileReader reader = new FileReader(filename)) {
			// Process the file
		}
	}

	public static void main(String[] args) {
		try {
			processFile("example.txt");
		} catch (IOException | IllegalArgumentException e) {
			System.err.println("An exception occurred: " + e.getMessage());
		}
	}
}
