package prat;

import java.util.Scanner;

public class pallindrome_array {

	public static void main(String[] args) 
	{
		int n,x=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		n=sc.nextInt();
		int a[]=new int[n];
		int m=n-1;
		System.out.println("The element are");
		for(int i=0;i<n;i++) 
		{
			a[i]=sc.nextInt();
		}
		for(int j=0;j<n;j++) 
		{
			if(a[j]==a[m]) 
			{
				x=1;

			}

			else 
			{
				x=0;
			}
			m--;

		}
		if(x==0) 
		{
			System.out.println("This is not pallindrome");
		}
		else 
		{
			System.out.println("This is  a pallindrome ");
		}

	}

}
