package Assignment_3;

public class VowelOrConsonant {
	static void VowelOrConsonant(char x) {
		if (x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U') {
			System.out.println("It is a Vowel");
		} else
			System.out.println("It is a Consonant");
	}

	public static void main(String[] args) {
		VowelOrConsonant('I');
		VowelOrConsonant('K');
	}
}
