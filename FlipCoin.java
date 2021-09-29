package Assignment_3;

import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {
		final int HEADS = 1;
		final int TAILS = 0;
		int headscount = 0;
		int tailscount = 0;
		int count = 1;
		Scanner flipcoin = new Scanner(System.in);
		System.out.println("Number of tims coin flipping:");
		int NumberOfFlips = flipcoin.nextInt();
		while (count <= NumberOfFlips) {
			count++;
			int random = (int) Math.floor(Math.random() * 2);
			if (random == TAILS) {
				tailscount++;
			} else if (random == HEADS)
				headscount++;
		}
		System.out.println("Number of times Heads comes:" + headscount);
		System.out.println("Number of times Tails comes:" + tailscount);
		double TailsPercentage = (double) tailscount / NumberOfFlips * 100;
		double HeadsPercentage = (double) headscount / NumberOfFlips * 100;
		System.out.println(" TailsPercentage is:" + TailsPercentage);
		System.out.println(" HeadsPercentage is:" + HeadsPercentage);
	}
}
