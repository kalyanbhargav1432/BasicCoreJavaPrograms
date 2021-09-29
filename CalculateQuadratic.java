package Assignment_3;

import java.util.Scanner;

public class CalculateQuadratic {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a,b,c values of Equation a * x * x + b * x + c :");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		double delta = (b * b) - (4 * a * c);
		double RootOne = (double) (- b + Math.sqrt(delta)) / (2 * a);
		double RootTwo = (double) (- b - Math.sqrt(delta)) / (2 * a);
		System.out.println("The Two Roots of the Equation:" + RootOne + " and " + RootTwo);
	}
}
