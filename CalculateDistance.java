package Assignment_3;

public class CalculateDistance {
	double Distance(int x, int y) {
		double Length;
		Length = (Math.sqrt(Math.pow(x * x, 2) + Math.pow(y * y, 2)));
		return Length;
	}
	public static void main(String[] args) {
		CalculateDistance distance = new CalculateDistance();
		double Distance = distance.Distance(4, 3);
		System.out.println("The distance is:" + Distance);
	}
}
