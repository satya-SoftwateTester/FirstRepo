package prat;

import java.util.Scanner;

public class right_shift {

	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the element");
		for(int i=0;i<n;i++) 
		{
			arr[i]=sc.nextInt();

		}
		int temp=arr[n-1];
		for(int i=n-1;i>0;i--) 
		{
			arr[i]=arr[i-1];
			
		}
		arr[0]=temp;
		for(int i=0;i<n;i++) 
		{
			System.out.println(arr[i]);
		}
	}

}
