package java_basics;

import java.util.Scanner;

public class star2 {

	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the row you want ");
		n=sc.nextInt();
		sc.close();
		for(int r=1;r<=n;r++) 
		{
			for( int j=1;j<=n;j++) 
			{

				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
