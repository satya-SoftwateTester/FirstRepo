package excetion_handling;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		a=sc.nextInt();
		System.out.println("enter number b");
		b=sc.nextInt();
		try 
		{
			c=a/b;
			System.out.println("the division is "+c);

		}
		catch(Exception e)
		{

			//System.out.println("The exception is - "+e);// to know the which exception is coming 
			System.out.println("cant divide by zero");
		}
		finally 
		{
			int d=a*b;
			System.out.println(d);//finally block execute all the time if exception occure or not
		}

	}

}
