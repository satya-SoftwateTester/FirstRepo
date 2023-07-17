package java_basics;

import java.util.Scanner;

public class star1 {

	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row you want");
		n=sc.nextInt();	
		sc.close();
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print("*");
			}
			System.out.println();

		}
	}

}
