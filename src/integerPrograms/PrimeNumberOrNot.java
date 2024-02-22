package integerPrograms;

public class PrimeNumberOrNot {

	public static void main(String[] args) {

		int num = 79;
		int temp = 0;

		for (int i = 2; i <= num - 1; i++) {

			if (num % i == 0) {
				temp++;
				
	
			}
		}
		if (temp == 0) {
			System.out.println(num + " is a Prime number");
		} else {
			System.out.println(num + " is not a prime  number ");
		}

	}
}
