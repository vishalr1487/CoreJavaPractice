package integerPrograms;

public class PairOfSumOf2Numbers {

	public static void get2Pairs(int arr[], int sum) {

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] + arr[j] == sum)) {
					count++;

					System.out.println(" count of pairs is " + count);

				}
			}
		}

	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 6, 4, 7, 5, 5, 8 };
		int sum = 10;
		get2Pairs(arr, sum);

	}

}
