package Assignment_3;

import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Rows :");
		int Rows = scanner.nextInt();
		System.out.println("Enter Column :");
		int Columns = scanner.nextInt();
		int Array[][] = new int[Rows][Columns];
		for (int i = 0; i < Rows; i++) {
			System.out.println(i + 1 + ":Row data ");
			for (int j = 0; j < Columns; j++) {
				System.out.println(j + 1 + ":Column data ");
				Array[i][j] = scanner.nextInt();
			}
		}
		System.out.println(" Matrix form: ");
		for (int i = 0; i < Rows; i++) {
			for (int j = 0; j < Columns; j++) {
				System.out.print("  " + Array[i][j]);
			}
			System.out.println(" ");
		}
	}
}