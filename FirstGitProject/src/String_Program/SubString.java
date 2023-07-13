package String_Program;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) 
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		str=sc.nextLine();
		char[]arr=str.toCharArray();
		System.out.println("Enter a substring");
		String str1=sc.nextLine();
		char[]arr1=str1.toCharArray();
		int count=0;
		for(int i=0;i<arr.length;i++) 
		{
			count=0;
			for(int j=0;j<arr1.length;j++) 
			{
				if(arr[i+j]==arr1[j]) 
				{
					count++;
				}
				else 
				{
					break;
				}
			}
			if(count==arr1.length) 
			{
				System.out.println("It is a substring");
				break;
			}
		}
		if(count!=arr1.length) 
		{
			System.out.println("It is not a sub-string");
		}
	}

}
