package Class_object;

import java.util.Scanner;

public class factor_power_febonacci {

	public static void main(String[] args) 
	{
		fpf fact=new fpf();
		fact.factor();
		fpf pwr=new fpf();
		pwr.power();
		fpf fbnc=new fpf();
		fbnc.fibonaci();
	}

}
class fpf
{
	public void factor() 
	{
		int n,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) 
		{
			if(n%i==0) 
			{
				System.out.println(i);
				count++;
			}
		}
		System.out.println("the  factor of number "+n+"  is "+count);
	}
	public void power() 
	{
		int n,power,res=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		System.out.println("enter the power you want");
		power=sc.nextInt();
		for(int i=1;i<=power;i++) 
		{

			res=res*n;

		}
		System.out.println("the power of number is "+res);
	}
	public void fibonaci() 
	{
		int n,first_num=0,second_num=1,next_num=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number that you want febonacy series ");
	     n=sc.nextInt();
		System.out.print(first_num+" ");
		System.out.print(second_num+" ");
		for( int i=1;i<=n;i++)
		{
	next_num=first_num+second_num;
	System.out.print(next_num+" ");
	first_num=second_num;
     second_num=next_num;	
		}
		System.out.println(next_num);
	}

}
