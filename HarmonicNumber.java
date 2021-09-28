package Assignment_3;

import java.io.*;

public class HarmonicNumber {
	static double nthHarmonic(int n) {
		double number = 1;
		for (int i = 2; i <= n; i++) {
			number = number + (double)1 / i;
		}
		return number;
	}
	public static void main(String[] args) {
		int n = 3;
		System.out.println("The value of Harmonic number is:" + nthHarmonic(n));
	}
}
