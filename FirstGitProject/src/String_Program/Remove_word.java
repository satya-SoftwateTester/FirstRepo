package String_Program;

import java.util.Scanner;

public class Remove_word {

	public static void main(String[] args) 
	{
		String str;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a String");
		str=sc.nextLine();
		char[]arr=str.toCharArray();
		System.out.println("enter a string");
		String str1;
		str1=sc.nextLine();
		char[]arr1=str1.toCharArray();
		int index=0;
		int count=0;
		for(int i=0;i<arr.length;i++) 
		{
			count=0;
			for(int j=0;j<arr1.length;j++) 
			{
				if(arr1[j]==arr[i+j]) 
				{
					count++;
				}

				//System.out.println(count);		
			}

			if(count==arr1.length) 
			{
				index=i;
				break;
			}
		}
		if(count==arr1.length) 
		{
			for(int k=0;k<arr1.length;k++) 
			{
				for(int m=index;m<arr.length-1;m++) 
				{
					arr[m]=arr[m+1];
				}
			}
			for(int j=0;j<arr.length-count;j++) 
			{
				System.out.print(arr[j]);
			}
		}
	}

}
