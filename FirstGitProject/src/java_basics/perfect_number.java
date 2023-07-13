package java_basics;

import java.util.Scanner;

public class perfect_number {

	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		n=sc.nextInt();
		int sum=0;
		sc.close();

		for(int i=1;i<n;i++) 
		{
			if(n%i==0) 
			{
				sum=sum+i;
			}
		}
		if(sum==n) 
		{
			System.out.println("this is a perfect number");
			
		}
		else 
		{
			System.out.println("This is not a perfect number");
		}
	}

}
