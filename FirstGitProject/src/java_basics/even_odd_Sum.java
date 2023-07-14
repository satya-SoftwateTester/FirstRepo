package java_basics;

import java.util.Scanner;

public class even_odd_Sum {

	public static void main(String[] args)
	{
		int n,rem,sum=0,sum1=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		n=sc.nextInt();
		while(n>0) 
		{
			rem=n%10;
			if(rem%2==0) 
			{
				sum=sum+rem;
			//	System.out.println("The no of even sum is "+sum);
			}
			else 
			{
				sum1=sum1+rem;
				//System.out.println("The no of odd sum is "+sum1);
			}
			n=n/10;
		}
		System.out.println("The no of even sum is "+sum);
		System.out.println("The no of odd sum is "+sum1);
	}

}
