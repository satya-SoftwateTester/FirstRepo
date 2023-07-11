package array_Program;

import java.util.Scanner;

public class Left_Shift {

	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the element");
		for(int i=0;i<n;i++) 
		{
			a[i]=sc.nextInt();

		}
		int temp=a[0];
		for(int i=0;i<n-1;i++) 
		{
			a[i]=a[i+1];

		}
		a[n-1]=temp;
		for(int i=0;i<n;i++) 
		{
			System.out.println(a[i]);
		}
	}

}
