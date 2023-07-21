package Class_object;

import java.util.Scanner;

public class char_Position {

	public static void main(String[] args)
	{

		char_pos cp=new char_pos();
		char [] res=cp.enter_stng();
		char res1=cp.enter_chr();
		cp.position(res, res1);

	}

}
class char_pos
{
	public static char[]enter_stng()
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		str=sc.nextLine();
		char[]arr=str.toCharArray();
		return arr;

	}
	public static char enter_chr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch;
		ch=sc.next().charAt(0);
		return ch;
	}
	public static int position(char []arr,char ch)
	{
		int pos=0;
		for(int i=0;i<arr.length;i++) 
		{

			if(arr[i]==ch)
			{
				pos=i;
				System.out.println("The character is in "+pos+"Position");

				break;
			}
		}
		return pos;
	}

}
