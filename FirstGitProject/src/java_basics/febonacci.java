package java_basics;

import java.util.Scanner;

public class febonacci {

	public static void main(String[] args) 
	{
		int n,first_num=0,second_num=1,next_num=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number that you want febonacy series ");
		n=sc.nextInt();
		System.out.print(first_num+" ");
		System.out.print(second_num+" ");
		sc.close();
		
		for( int i=1;i<=n;i++)
		{
			next_num=first_num+second_num;
			System.out.print(next_num+" ");
			first_num=second_num;
			second_num=next_num;
	}

	}
}
