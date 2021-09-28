package Assignment_3;

import java.util.Scanner;

public class PowerOfTwo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a power value:");
		int Power = scanner.nextInt();
		double PowerValue = Math.pow(2, Power);
		System.out.println("print the power value:" + PowerValue);
		int temp = 1;
		while (Math.pow(2, temp) <= PowerValue) {
			System.out.println("2^" + temp + "=" + Math.pow(2, temp));
			temp++;
		}
	}
}
