package String_Program;

import java.util.Scanner;

public class occarance_character {

	public static void main(String[] args)
	{
		String str;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter a string");
		str=sc.nextLine();
		char arr[]=str.toCharArray();
		System.out.println("enter a character ");
		char ch=sc.next().charAt(0);
		for(int i=0;i<arr.length;i++) 
		{


			if(arr[i]==ch) 
			{
				count++;
			}

		}
		System.out.println(count);
	}

}
