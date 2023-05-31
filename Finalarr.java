package javapratice;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.reflect.Array;
public class Finalarr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/* final int arr1[]= {10,20,30,40,50};
		 int arr2[]=Arrays.copyOf(arr1, 5);
		System.out.println(Arrays.toString(arr2));
		arr1= new int[]{4,5,6,8,};
		System.out.println(Arrays.toString(arr1));*/
		int []arr= {4,5,8,9};
		Class  CT = arr.getClass().getComponentType();
		System.out.println("type "+CT);
		 int length = Array.getLength(arr);
	        System.out.println("Array Length: " + length);
	        System.out.println("enter the index to find");
	        int n=sc.nextInt();
	    
	        //finding the element
	        
	        int firstElement = (int) Array.get(arr, 3);
	        System.out.println("First Element: " + firstElement);

	        
	        //modification of data
	        Array.set(arr, 0, 10);
	        int modifiedElement = arr[0];
	        System.out.println("Modified Element: " + modifiedElement);
	    }
	}


