package Assignment_3;

import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {
		int Heads = 0;
		int Tails = 1;
		int count = 1;
		Scanner flipcoin = new Scanner(System.in);
		System.out.println("Number of tims coin flipping:");
		int NumberOfFlips = flipcoin.nextInt();
		while (count != NumberOfFlips) {
			count++;
			int random = (int) Math.floor(Math.random() * 2);
			if (random == 0) {
				Tails++;
			} else
				Heads++;
		}
		System.out.println("Number of times Heads comes:" + Heads);
		System.out.println("Number of times Tails comes:" + Tails);
		double TailsPercentage = (double) Tails / NumberOfFlips * 100;
		double HeadsPercentage = (double) Heads / NumberOfFlips * 100;
		System.out.println(" TailsPercentage is:" + TailsPercentage);
		System.out.println(" HeadsPercentage is:" + HeadsPercentage);
	}
}
