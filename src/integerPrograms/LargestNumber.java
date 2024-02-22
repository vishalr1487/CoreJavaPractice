package integerPrograms;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {

		int x, y, z;

		System.out.println("Enter the numbers : ");

		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();

		if (x > y && x > z) {
			System.out.println("First number is largest");
		} else if (y > z && y > x) {
			System.out.println("Second number is largest");
		} else if (z > x && z > y) {
			System.out.println("Third number is largest");
		}

	}

}
