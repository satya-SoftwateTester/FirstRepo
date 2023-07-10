package prat;

import java.util.Scanner;

public class array_element_enter {

	public static void main(String[] args) 
	{
		int n,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the element");
		for(int i=0;i<n;i++) 
		{
			arr[i]=sc.nextInt();

		}
		for(int i=0;i<n;i++) 
		{
			System.out.println(arr[i]);
			System.out.println(i);
			System.out.println("satya");
		}

	}

}
