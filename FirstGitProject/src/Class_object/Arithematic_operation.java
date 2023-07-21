package Class_object;

import java.util.Scanner;

public class Arithematic_operation {

	public static void main(String[] args)
	{
		operation res=new operation();
		res.add();
		operation res1=new operation();
		res1.sub();
		operation res3=new operation();
		res3.mul();
		operation res4=new operation();
		res4.div();
		operation res5=new operation();
		res5.mod();


			}
		}
		 class operation
		{
			int a,b,res;
			
			
			public  void add() 
			{
				Scanner sc=new Scanner (System.in);
				System.out.println("enter a value");
				a=sc.nextInt();
				System.out.println("enter b value");
				b=sc.nextInt();
				res=a+b;
				System.out.println("The addition is"+res);
				//sc.close();
			}
			public  void sub() 
			{
				Scanner sc=new Scanner (System.in);
				System.out.println("enter a value");
				a=sc.nextInt();
				System.out.println("enter b value");
				
				b=sc.nextInt();
				res=a-b;
				System.out.println("The addition is"+res);
				//sc.close();
			}
			public void mul() 
			{
				Scanner sc=new Scanner (System.in);
				System.out.println("enter a value");
				a=sc.nextInt();
				System.out.println("enter b value");
				
				b=sc.nextInt();
				res=a*b;
				System.out.println("The multiplication  is"+res);
				//sc.close();
			}
			public void div() 
			{
				Scanner sc=new Scanner (System.in);
				System.out.println("enter a value");
				a=sc.nextInt();
				System.out.println("enter b value");
				
				b=sc.nextInt();
				res=a/b;
				System.out.println("The division is"+res);
				//sc.close();
			}
			public void mod() 
			{
				Scanner sc=new Scanner (System.in);
				System.out.println("enter a value");
				a=sc.nextInt();
				System.out.println("enter b value");
				
				b=sc.nextInt();
				res=a%b;
				System.out.println("The modulus is"+res);
				//sc.close();
	}

}
