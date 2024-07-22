package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

class FileProcessingException extends Exception {
	    public FileProcessingException(String message, Throwable cause) {
	        super(message, cause);
	    }
	}

	public class ExceptionChainingExample {
	    public static void processFile(String filename) throws FileProcessingException {
	        try {
	            new FileReader(filename);
	        } catch (FileNotFoundException e) {
	            throw new FileProcessingException("Failed to process file: " + filename, e);
	        }
	    }

	    public static void main(String[] args) {
	        try {
	            processFile("nonexistentfile.txt");
	        } catch (FileProcessingException e) {
	            System.err.println("Caught a FileProcessingException: " + e.getMessage());
	            e.getCause().printStackTrace();
	        }
	    }
	}


