package integerPrograms;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {

		// MULTIPLY ANY TWO NUMBERS 
		
		int a, b;
		System.out.println("Enter range of numbers to print their multiplication table");
		
		Scanner sc = new Scanner(System.in);
		 a= sc.nextInt();
		 b= sc.nextInt();
		 
		 
		 for(int i=a; i<=b; i++) {
			 
			 System.out.println("Multiplication table of " + i);
			 System.out.println(" ");
			 
			 for(int j=1; j<=10 ; j++) {
				 System.out.println( i + " * " + j + " = " + (i*j));
			 }
		 }
		
		
		

	}

}
