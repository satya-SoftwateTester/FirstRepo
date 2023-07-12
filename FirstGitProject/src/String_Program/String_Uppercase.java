package String_Program;

import java.util.Scanner;

public class String_Uppercase {

	public static void main(String[] args) 
	{

		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		str=sc.nextLine();
		sc.close();
		char []arr=str.toCharArray();
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]>=97&&arr[i]<=122) 
			{
				arr[i]=(char)(arr[i]-32);
				System.out.println(arr[i]);
			}
			else 
			{
				System.out.println(arr[i]);
			}
		}
	}

}
