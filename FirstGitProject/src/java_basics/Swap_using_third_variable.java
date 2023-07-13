package java_basics;

import java.util.Scanner;

public class Swap_using_third_variable {

	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a value");
		a=sc.nextInt();
		System.out.println("Enter b value");
		b=sc.nextInt();
		sc.close();

		c=0;
		c=a;
		a=b;
		b=c;
		System.out.println("After swapping the value  of a is: "+a+"and b"
				+ ""+b);
	}

}
