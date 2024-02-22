package integerPrograms;

public class PrimeNumbers {

	public static void main(String[] args) {

		// 	if you want to print prime numbers from 1-100 use 'NUM' 
		
		for (int num = 1; num <= 100; num++) {
			int temp = 0;

			for (int i = 2; i <= num - 1; i++) {

				if (num % i == 0) {
					temp = temp + 1;
				}
			}
			if (temp == 0) {
				
				System.out.print(num + " ");
			}
		}

	}
}
