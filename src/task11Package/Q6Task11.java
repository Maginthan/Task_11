package task11Package;

import java.util.Scanner;

public class Q6Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Get user inputs from user for password
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String Str = sc.next();
		System.out.println("Please enter your password: ");
		String Psd = sc.next();

		System.out.println("----------------------------------------");

		// Creating object for passwordMatch class and call the password method
		PasswordMatch obj = new PasswordMatch();
		obj.password(Psd);

	}

}

class PasswordMatch {

	// Correct password string to match with user password
	String pass = "Password@12";

	public void password(String Psd) {
				

		// Using try and catch block with if condition to check the correct password.
		try {
			if (!pass.equals(Psd)) {

				// Calling custom exception to handle the incorrect password
				throw new InvalidPasswordException("Incorrect Password entered by user");
			}
		} catch (InvalidPasswordException e) {
			System.out.println("Incorrect password entered. The correct user password should be: " + pass);
			e.printStackTrace();
			e.getMessage();
		}

		// Using finally block to print the entered user password
		if (pass.equals(Psd)) {
			 System.out.println("The password entered is correct");	
		}

	}
}