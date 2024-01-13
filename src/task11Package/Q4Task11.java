package task11Package;

import java.util.Scanner;

public class Q4Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int C;

		// Get two user inputs from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a value for A: ");
		int A = sc.nextInt();
		System.out.println("Please enter a value for B: ");
		int B = sc.nextInt();

		// Try catch block to handle exception
		try {
			C = A / B;
		}

		catch (ArithmeticException e) {
			System.out.println("The value of b entered is less than or equal to zero");
			e.printStackTrace();
			C = A / 1;
			System.out.println("The value of B is changed to 1");
		}

		System.out.println("----------------------------------------");

		// Printing the C value when the B
		System.out.println("The value of C is: " + C);
	}

}
