package demo;

import java.util.Arrays;

public class Demo {
	
	
	public static int[] moveZerosToLeft(int[] array) {
		
		// IF ARRAY CONTAINS ONLY ONE ELEMENT
		
		if(array.length==1) {
			return array;
		}
		
		int[] newArray = new int[array.length];
		
		int count=array.length-1;
		
		for(int i=array.length-1; i>0; i--) {
			
			if(array[i]!=0) {
				
				newArray[count]= array[i];
				count--;
			}
		}
		
		System.out.println(Arrays.toString(newArray));
		return newArray;
			
	}
	

	public static void main(String[] args) {
		
		int[] array= new int[] {1,0,2,0,4,0,5,0,6,0};
		
		moveZerosToLeft(array);
		//System.out.print(Arrays.toString(moveZerosToRight(array)));
		// you can call this method in main method or in above method .... 
		
	}

}
