package Class_object;

import java.util.Scanner;

public class duplicate_string {

	public static void main(String[] args) 
	{
		dupli_char dc=new dupli_char();
		char []res=dc.enter_stng();
		dc.duplicate(res);
	}

}
class dupli_char
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
	public static char []duplicate(char []arr)
	{
		int count=0;
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]==arr[j]) 
				{
					count++;
					for(int k=i-1;k>=0;k--) 
					{
						if(arr[k]==arr[i]) 
						{
							count--;
						}
					}
				}


			}
			if(count>=1) 
			{
				System.out.println( "duplicate is "+arr[i]);
			}
			count=0;
		}
		return arr;
	}

}
