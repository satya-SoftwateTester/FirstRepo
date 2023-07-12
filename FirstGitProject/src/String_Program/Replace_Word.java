package String_Program;

import java.util.Scanner;

public class Replace_Word {

	public static void main(String[] args) 
	{
		String str;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a string");
		str=sc.nextLine();
		char[]arr=str.toCharArray();
		System.out.println("Enter which element you want insert instead of this");
		String str1=sc.nextLine();
		char[] arr1=str1.toCharArray();
		System.out.println("Enter the element");
		String str2=sc.nextLine();
		char[]arr2=str2.toCharArray();
		int count=0;
		int index=0;
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
			index=i;
			if(count==arr1.length) 
			{
				for(int l=0;l<arr2.length;l++) 
				{
					arr[index]=arr2[l];
					index++;
				}
			}
		}
		for(int i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i]);
		}
	}

}
