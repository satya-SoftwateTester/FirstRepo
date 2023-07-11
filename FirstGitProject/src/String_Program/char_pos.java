package String_Program;

import java.util.Scanner;

public class char_pos {

	public static void main(String[] args) 
	{

		String str;int pos=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		str=sc.nextLine();
		char[]arr=str.toCharArray();
		System.out.println("Enter a character");
		char ch;
		ch=sc.next().charAt(0);
		sc.close();
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]==ch)
			{
				pos=i;
				System.out.println("The character is in "+pos+"Position");
				break;
			}
		}
	}

}
