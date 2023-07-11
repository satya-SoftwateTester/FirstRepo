package array_Program;

import java.util.Scanner;

public class Array_rev {

	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the element");
		for(int i=0;i<n;i++) 
		{
			a[i]=sc.nextInt();

		}
		int size=n-1;
		int temp=0;
		for(int i=0;i<n/2;i++) 
		{
			temp=a[i];
			a[i]=a[size];
			a[size]=temp;

			size--;

		}
		System.out.println("The reverse is ");
		for (int i=0;i<n;i++) 
		{
			System.out.println(a[i]);
		}
	}

}
