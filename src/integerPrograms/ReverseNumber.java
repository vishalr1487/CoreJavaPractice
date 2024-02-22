package integerPrograms;

public class ReverseNumber {

	public static void main(String[] args) {

		int num = 12345;
		int result = 0;
		System.out.println("Original number is : " + num);

		while (num != 0) {
			int remainder = num % 10;
			result = result * 10 + remainder;
			num = num / 10;

		}

		System.out.println("Reversed number is : " + result);

	}

}
