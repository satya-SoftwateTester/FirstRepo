package String_Program;

import java.util.Scanner;

public class remove_character {

	public static void main(String[] args) 
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		str=sc.nextLine();
		char[]a=str.toCharArray();
		System.out.println("Enter a character");
		char ch=sc.next().charAt(0);
		String  result="";
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]!=ch) 
			{
				result=result+a[i];
			}
		}
		System.out.print(result);
	}

}
