package Assignment_3;

public class LargestAmongThreeNumbers {
	public static void main(String[] args) {
		int x = 15, y = 30, z = 40;
		if (x >= y && x >= z) {
			System.out.println("X is largest number:" + x);
		} else if (y >= x && y >= z) {
			System.out.println("Y is largest number:" + y);
		} else
			System.out.println("Z is largest number:" + z);
	}

}
