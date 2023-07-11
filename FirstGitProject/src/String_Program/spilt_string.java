package String_Program;

import java.util.Scanner;

public class spilt_string {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		char[] arr=str.toCharArray();
		int count=1;
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]==' ') 
			{
				count++;
				
			}
		
		}
		int index=0;
		String temp="";
		String[] arr1=new String[count];
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]==' ') 
			{
				index++;
				temp="";
			}
			else 
			{
				temp=temp+arr[i];
				arr1[index]=temp;
			}
		}
		for(int i=0;i<arr1.length;i++) 
		{
			System.out.println(arr1[i]);
		}
	}

}
