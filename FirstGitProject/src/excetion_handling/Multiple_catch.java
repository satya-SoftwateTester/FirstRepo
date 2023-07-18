package excetion_handling;

import java.util.Scanner;

public class Multiple_catch {

	public static void main(String[] args) 
	{
		String str;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a String");
		str=sc.nextLine();
		char []arr=str.toCharArray();
		try 
		{
			for(int i=0;i<arr.length/2;i++) 
			{
				char temp=arr[arr.length+1+i];//instead of - put +
				arr[arr.length-1-i]=arr[i];
				arr[i]=temp;
			}
			System.out.println("the reverse String is ");
			for(int i=0;i<arr.length;i++) 
			{
				System.out.print(arr[i]);
			}

		}
		catch(ArithmeticException e) 
		{
			System.out.println("not working");
		}
		catch(IndexOutOfBoundsException e) 
		{
			System.out.println("check the code");
		}
		catch(Exception x) 
		{
			System.out.println("something went wrong");
		}
		finally 
		{
			System.out.println("memory deleted");
		}

	}

}
