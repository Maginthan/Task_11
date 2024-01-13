package task11Package;

import java.util.Scanner;

public class Q5Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Get two user inputs from user for Array and string exception
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word with nine letters: ");
		String Str = sc.next();
		System.out.println("Please enter a value greater than 9: ");
		int Arr = sc.nextInt();

		// Calling String exception method
		StringIndexOutOfBoundsExceptionExample(Str);

		System.out.println("----------------------------------------");

		// Calling Array exception method
		ArrayIndexOutOfBoundsExceptionExample(Arr);

	}

	public static void StringIndexOutOfBoundsExceptionExample(String str) {

		// Try and catch block to handle StringIndexOutOfBoundsException
		try {
			System.out.println(str.charAt(10));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String index out of bounds. String length: " + str.length());
			e.printStackTrace();
			System.out.println("Fetching string index value 1: " + str.charAt(1));
		}
	}

	public static void ArrayIndexOutOfBoundsExceptionExample(int arr) {

		// Declaring int array with limit and int variable to save in the int array
		int[] intArr = new int[9];
		int value = 15;

		// Try and catch block to handle ArrayIndexOutOfBoundsException
		try {
			intArr[arr] = value;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds. Array length: " + intArr.length);
			e.printStackTrace();
			intArr[1] = value;
			System.out.println("Adding array element 15 within the index of array's length " + intArr.length);
		}

	}

}
