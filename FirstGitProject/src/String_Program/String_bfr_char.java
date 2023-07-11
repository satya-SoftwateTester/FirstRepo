package String_Program;

import java.util.Scanner;

public class String_bfr_char {

	public static void main(String[] args) 
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		str=sc.nextLine();
		char[]a=str.toCharArray();
		System.out.println("Enter a character");
		char ch=sc.next().charAt(0);
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]==ch) 
			{
				for(int j=0;j<i;j++) 
				{
					System.out.print(a[j]);
					
				}
			}
		}
	}

}
