package prat;

import java.util.Scanner;

public class exception1 {
	
	public static void main(String[] args)
	{
		int n,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array you want");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println(" the element are");
		for(int i=0;i<n;i++) 
		{
			arr[i]=sc.nextInt();
		}
		try 
		{
			for(int i=0;i<n;i++) 
			{
				for(int j=i+1;j<n;j++) 
				{
					if(arr[i]>arr[j]) 
					{
						temp=arr[i];
						arr[i]=arr[j+1];
						arr[j]=temp;
					}
				}
				System.out.println(arr[i]);
			}

		}
		catch(ArithmeticException e) 
		{
			System.out.println("not good");
		}
		catch(NullPointerException m) 
		{
			System.out.println(" try again");
		}
		catch(IndexOutOfBoundsException q) 
		{
			System.out.println("correct the code");	
		}
		catch(Exception g) 
		{
			System.out.println("something went wrong");
		}
		finally 
		{
			System.out.println("memory released ");
		}


	}

}
