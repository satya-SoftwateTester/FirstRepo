package prat;

import java.util.Scanner;

public class array_dec {

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
			for(int j=i+1;j<n;j++) 
			{
				if(arr[i]<arr[j]) 
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
		}
	}

}
