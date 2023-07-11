package String_Program;

import java.util.Scanner;

public class Insert_word {

	public static void main(String[] args) 
	{

		String str;
		Scanner sc=new Scanner (System.in);
		System.out.println("Emter a string");
		str=sc.nextLine();
		char[]arr=str.toCharArray();
		System.out.println("Enter which element you want to enter after that");
		String str1=sc.nextLine();
		char []arr1=str1.toCharArray();
		System.out.println("Enter a string that you want to insert");
		String str2=sc.nextLine();
		char[]arr2=str2.toCharArray();
		int index=0;
		int count=0;
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
				index=i;
				for(int k=0;k<=arr2.length;k++) 
				{
					for(int l=arr.length-1;l>i+count;l--) 
					{
						arr[l]=arr[l-1];
					}
				}
				break;
			}
		}
		index=index+count+1;
		for(int i=0;i<arr2.length;i++) 
		{
			arr[index]=arr2[i];
			index++;
		}
		for(int i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i]);
		}
	}

}
