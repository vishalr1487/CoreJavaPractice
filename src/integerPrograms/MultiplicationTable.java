package integerPrograms;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		int n;
		System.out.println("Enter an integer to print it's multiplication : ");
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.println( n + " * " + i + " = " + (n*i));
		}
		
		
		
		

	}

}
