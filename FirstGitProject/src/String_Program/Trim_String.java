package String_Program;

import java.util.Scanner;

public class Trim_String {

	public static void main(String[] args) 
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		str=sc.nextLine();
		char[]a=str.toCharArray();
		int start=0;
		int end=a.length-1;
		String result="";
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]!=' ') 
			{
				start=i;
				break;
				
			}
		}
		for(int i=a.length-1;i>=0;i--) 
		{
			if(a.length-1!=' ') 
			{
			end=i;
			break;
		}
		}
			
		for(int i=start;i<=end;i++) 
		{
			result=result+a[i];
		}
		System.out.println(result);
	}

}
