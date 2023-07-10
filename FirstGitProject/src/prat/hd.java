package prat;

import java.util.Scanner;

public class hd {

	public static void main(String[] args) 
	{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
a=sc.nextInt();
System.out.println("enter b number");
b=sc.nextInt();
int c=a+b;
System.out.println("Addition of two number"+c);
int d=a/b;
System.out.println("division of two number is "+d);
int m=a*b;
System.out.println("multiplication is "+m);
int s=a-b;
System.out.println("substraction of these is "+s);
int mod=a%b;
System.out.println("modulus of two number is "+mod);
	}

}
