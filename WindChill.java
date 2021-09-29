package Assignment_3;

public class WindChill {
	public static void main(String[] args) {
		double Temperature = 32;
		double WindSpeed = 45;
		double WindChill;
		WindChill = 35.74 + (0.6215 * 32) + (((0.4275 * 32) - 35.75) * Math.pow(45, 0.16));
		System.out.println("The WindChill value is:" + WindChill);

	}
}
