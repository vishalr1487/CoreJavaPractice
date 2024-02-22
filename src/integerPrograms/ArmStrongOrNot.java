package integerPrograms;

public class ArmStrongOrNot {

	public static void main(String[] args) {
		
		// ARMSTRONG NUMBERS : A number that equals the sum of its digits, each raised to a power.
		// 153 = 1^3 + 5^3 + 3^3 equals 153. 3----> bcoz total digits in the given number is 3 

		int num = 153;
		int result = 0;
		int remainder;
		int temp;

		temp = num;

		while (temp != 0) {
			remainder = temp % 10;
			result = result + (remainder * remainder * remainder);
			temp = temp / 10;

		}

		if (result == num) {
			System.out.println(num + " " + " is an Armstrong number ");
		} else {
			System.out.println(num + " is not an Armstrong number ");
		}

	}

}
