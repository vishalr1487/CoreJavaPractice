package integerPrograms;

import java.util.Scanner;

public class Swap2NumbersUsingVar {

	public static void main(String[] args) {
		
		int x,y,temp;
		System.out.println("Enter the values of x and y : ");
		Scanner sc = new Scanner(System.in);
		x= sc.nextInt();
		y= sc.nextInt();
		
		System.out.println("Before Swaping\nx = " + x + "\ny = " + y);
		
		temp= x;
		x=y;
		y=temp;
		
		System.out.println("After swapping\nx = " + x + "\ny = " + y);
		
	}

}
