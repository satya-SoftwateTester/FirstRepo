package java_basics;

import java.util.Scanner;

public class Arithematic_Operation {

	public static void main(String[] args) 
	{
		int a,b,add,sub,mul,div,mod;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no a :");
		a=sc.nextInt();
		System.out.println("Enter no b ");
		b=sc.nextInt();
		sc.close();
		add=a+b;
		System.out.println("The Addition of "+a+" "+"and"+" "+b+" "+"is:"+" "+add);
		sub=a-b;
		System.out.println("The Substraction of "+a+" "+"and"+" "+b+" "+"is:"+" "+sub);
		mul=a*b;
		System.out.println("The Multiplication of "+a+" "+"and"+" "+b+" "+"is:"+" "+mul);
		div=a/b;
		System.out.println("The Division of "+a+" "+"and"+" "+b+" "+"is:"+" "+div);
		mod=a%b;
		System.out.println("The Modulus  of "+a+" "+"and"+" "+b+" "+"is:"+" "+mod);



	}

}
