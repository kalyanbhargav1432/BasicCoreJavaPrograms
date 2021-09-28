package Assignment_3;

import java.util.Scanner;

public class NumberEvenOrOdd {
	public static void main(String[] args) {
		int number;
		Scanner object = new Scanner(System.in);
		System.out.println("Enter a number:");
		number = object.nextInt();
		if (number % 2 == 0) {
			System.out.println("Number is Even");
		} else
			System.out.println("Number is Odd");
	}

}
