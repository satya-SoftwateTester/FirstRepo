package excetion_handling;

import java.util.Scanner;

public class indexoutofbound {

	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  no of element you want");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the element you want");
		for(int i=0;i<n;i++) 
		{
			arr[i]=sc.nextInt();
		}
		try 
		{
			System.out.println(arr[3]);
		}
		catch(ArithmeticException x)
		{
			System.out.println("this is wrong");
		}
		try 
		{
			System.out.println(arr[10]);
		}
		catch(IndexOutOfBoundsException x)
		{
			System.out.println("this is out of bound");
		}
	}

}
