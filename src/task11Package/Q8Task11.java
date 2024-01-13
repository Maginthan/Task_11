package task11Package;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Q8Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Get user inputs from user for text file to read
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your text file to read: ");
		String Str = sc.next();

		// Try catch block to handle the exception
		try {
			// Calling the read file with input text file from user.
			readFile(Str);
		} catch (FileNotFoundException e) {
			System.out.println("An error occured while reading the file: " + e.getMessage());
			e.printStackTrace();
		}

	}

	public static void readFile(String fileName) throws FileNotFoundException {
		// Creates a file object and initialised with given user entered file name.
		File file = new File("/Users/maginthangr/eclipse-workspace/Task11/src/task11Package/" + fileName);
		// System.out.println(file.getAbsolutePath());

		// Creating a scanner object
		Scanner myReader = new Scanner(file);

		// Read and process the contents of the file
		while (myReader.hasNextLine()) {
			String data = myReader.nextLine();
			System.out.println(data);
		}
		// Closing the file
		myReader.close();
	}
}
