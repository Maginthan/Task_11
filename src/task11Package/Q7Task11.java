package task11Package;

import java.util.Scanner;

public class Q7Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Get user input from user for age
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your age: ");
		int Age = sc.nextInt();

		// Calling getAge method to handle exception
		getAge(Age);
	}

	public static void getAge(int age) {

		// Using try and catch block with if condition to check the age is less than 18
		try {
			if (age < 18) {
				throw new InvalidAgeException("The entered user's age is less than 18");
			} else {
				System.out.println("The entered user's age is greater than or equal to 18");
			}

		} catch (InvalidAgeException e) {

			// Keep a reference to a variable not to affect the age variable as it will
			// affect the finally block output
			int oldAge = age;
			oldAge = 1;
			System.out.println("The user's entered is changed to :" + oldAge + " to avoid exception");
			e.printStackTrace();
		}
		// Finally block to print the actual age entered by user
		finally {
			System.out.println("----------------------------------------");
			System.out.println("The entered user's age is: " + age);
		}
	}

}
