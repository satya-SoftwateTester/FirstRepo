package java_basics;

import java.util.Scanner;

public class swap_without_Using_third_variable {

	public static void main(String[] args)
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		a=sc.nextInt();
		System.out.println("Enter b value");
		b=sc.nextInt();
		sc.close();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swaping the no of a is "+a+" "+"and b is "+b);

	}

}
