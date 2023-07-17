package java_basics;

import java.util.Scanner;

public class Even_odd_Switch {

	public static void main(String[] args)
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		a=sc.nextInt();
		int n=a%2;
		sc.close();
		switch(n)
		{
		case 0: 
			System.out.println("even");
			break;
		case 1:
			System.out.println("odd");
			break;
		default:
			System.out.println("invalid inputs");
		}

	}

}
