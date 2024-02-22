package integerPrograms;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {

//		Get the number to check for palindrome
//		Hold the number in temporary variable
//		Reverse the number
//		Compare the temporary number with reversed number
//		If both numbers are same, print "palindrome number"
//		Else print "not palindrome number"
		
	
		int num =12121;
		int temp;
		int remainder;
		int result=0;
		
		temp=num;
		while(num!=0) {
			
			remainder = num%10;
			result = result * 10 + remainder;
			num= num/10;
			
		}
		
		if(temp==result) {
			System.out.println(result + " is a palindrome");
		}
		
		else {
			System.out.println(result + " is not a palindrome ");
		}
		
		
		
	}

}
