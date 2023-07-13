package java_basics;

import java.util.Scanner;

public class power {

	public static void main(String[] args) 
	{
		int n,power,res=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		System.out.println("enter the power you want");
		power=sc.nextInt();
		sc.close();
		for(int i=1;i<=power;i++) 
		{
			
			res=res*n;
			
		}
		System.out.println("the power of number is "+res);
			
	}

}
