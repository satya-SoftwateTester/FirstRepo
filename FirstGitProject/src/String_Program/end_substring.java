package String_Program;

import java.util.Scanner;

public class end_substring {

	public static void main(String[] args) 
	{
		String str;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		str=sc.nextLine();
		char[]arr=str.toCharArray();
		System.out.println("Enter a sub-string");
		String sub_str=sc.nextLine();
		char[]arr1=sub_str.toCharArray();
		int size=arr.length-1;
		for(int i=arr1.length-1;i>=0;i--) 
		{
			if(arr[size]==arr1[i]) 
			{
				count++;
				size--;
			}
		}
		if(count==arr1.length) 
 		{
			System.out.println("it is a sub string");
		}
		else 
		{
			System.out.println("it is not a sub string");
		}
	}

}
