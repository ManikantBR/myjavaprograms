package javapratice;

import java.util.Arrays;
import java.util.Scanner;

public class araypratice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.err.println("enter the size");
		int n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int arr2[]=new int[n];
		int j=arr.length-1;
		for(int i=0;i<arr.length;i++)
		{
			arr2[j]=arr[i];
			j--;
		}
		System.out.println("original array");
		System.out.println(Arrays.toString(arr));
		System.out.println("reversed array");
		System.out.println(Arrays.toString(arr2));
	}

}
