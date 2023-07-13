package java_basics;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) 
	{
		int n,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		n=sc.nextInt();
		sc.close();
		for( int i=1;i<=n;i++) 
		{
			if(n%i==0) 
			{
				count=count+1;
			}
		}
		if(count==2) 
		{
			System.out.println("number is prime");
			
		}
		else 
		{
			System.out.println("not a prime number");
		}

	}

}
