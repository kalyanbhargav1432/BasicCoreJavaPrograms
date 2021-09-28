package Assignment_3;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		int NumberOne = 10;
		int NumberTwo = 20;
		int temp;
		System.out.println("before swaping numbers:" + NumberOne + "," + NumberTwo);
		temp = NumberOne;
		NumberOne = NumberTwo;
		NumberTwo = temp;
		System.out.println("After swaping numbers:" + NumberOne + "," + NumberTwo);

	}
}
