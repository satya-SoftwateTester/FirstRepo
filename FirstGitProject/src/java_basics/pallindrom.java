package java_basics;

import java.util.Scanner;

public class pallindrom {

	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number you want");
		n=sc.nextInt();
		sc.close();
		int temp=n,rem=0,rev=0;
		while(temp>0) 
		{
			rem=temp%10;
			rev=(rev*10)+rem;
			temp=temp/10;
		}
		if(rev==n) 
		{
			System.out.println("this is a pallindrome number");
		}
		else 
		{
			System.out.println("this is not a pallindrome");
		}
		
	}

}
