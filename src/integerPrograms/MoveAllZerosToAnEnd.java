package integerPrograms;

import java.util.Arrays;

public class MoveAllZerosToAnEnd {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 0, 3, 0, 4, 0, 5, 0, 6 };
		int len = arr.length;
		int count = 0;
		int tempArr[] = new int[arr.length];

		for (int i = 0; i < len; i++) {     /// if you want to move zeros to left then iterate in reverse order.
			if (arr[i] != 0) {

				tempArr[count] = arr[i];  
				count++;
				/// tempArr[count] means as count is set to zero temp[0] it will stores. thats why
				// we are increasing the count;
				
				while(count<len) {
					arr[count++]=0;
				}
				
			}
		}

		System.out.println(Arrays.toString(arr));
		System.out.println();
		System.out.println(Arrays.toString(tempArr));

	}

}
