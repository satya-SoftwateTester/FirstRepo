package String_Program;

import java.util.Scanner;

public class Vowel_Consonant_count {

	public static void main(String[] args) 
	{
		String str;
		int vowl_count=0;
		int con_count=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a string");
		str=sc.nextLine();
		sc.close();
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]=='a'||arr[i]=='A'||arr[i]=='E'||arr[i]=='e'||arr[i]=='i'||arr[i]=='I'||arr[i]=='O'||arr[i]=='o'||arr[i]=='u'||arr[i]=='U') 
			{
				vowl_count++;
			}
			else if(arr[i]==' '||arr[i]=='.')
			{
				System.out.print("");
			}
			else
			{
				con_count++;
			}

		}
		System.out.println("the vowel present is "+vowl_count+"and the consonant present is"+con_count);
	}
}

