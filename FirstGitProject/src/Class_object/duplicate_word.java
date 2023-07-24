package Class_object;

import java.util.Scanner;

public class duplicate_word {

	public static void main(String[] args) 
	{
		dupli_word dw=new dupli_word();
		char[]res=dw.enter_stng();
		char[]res1=dw.enter_wrd();
		dw.find_Duplicate(res, res1);
	}

}
class dupli_word
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
	public static char[]enter_wrd()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word");
		String str1=sc.nextLine();
		char[] arr1=str1.toCharArray();
		return arr1;
	}
	public static int find_Duplicate(char[] arr,char[] arr1) 
	{
		int count =0;int count1=0;
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
				count1++;
			}
		}
		System.out.println("the duplicate word present in this sentence is "+count1);
		return count1;
	}

}
