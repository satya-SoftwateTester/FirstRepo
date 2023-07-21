package Class_object;

import java.util.Scanner;

public class armstrong_perfect_prime_pallindrome {


		public static void main(String[] args)
		{
			basic pall=new basic();
			pall.pallindrome();
			//basic pft=new basic();
			pall.perfect();
			//basic prm=new basic();
			pall.prime();
			//basic armstng=new basic();
			pall.armstrong();
		}
	}
	 class basic
	{

		public void pallindrome() 
		{
			int n;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number you want");
			n=sc.nextInt();
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
				System.out.println("it is not a pallindrome number");
			}
		}
		public void perfect() 
		{
			int n;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a number");
			n=sc.nextInt();
			int sum=0;
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
		public void prime()
		{
			int n,count=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a number");
			n=sc.nextInt();
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
		public void armstrong() 
		{
			int n;
			Scanner sc=new Scanner (System.in);
			System.out.println("Enter a number");
			n=sc.nextInt();
			int temp=n,res=0,rem,sum=0;
			while(temp>0) 
			{
				temp=temp/10;
				sum=sum+1;
			}
			int temp1=n;
			while(temp1>0) 
			{
				int value=1;
				rem=temp1%10;
				for(int k=1;k<=sum;k++) 
				{
					value=value*rem;
				}
				res=res+value;
				temp1=temp1/10;
			}
			if(res==n) 
			{
				System.out.println(" it is a armstrong number");
			}
	}

}
