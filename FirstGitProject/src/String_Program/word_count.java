package String_Program;

import java.util.Scanner;

public class word_count {

	public static void main(String[] args) 
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		str=sc.nextLine();
		char[]arr=str.toCharArray();
		int count=1;
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]==' ') 
			{
				if(!(i==0||i==arr.length-1)) 
				{
					count++;
				}
				if(i!=(arr.length-1)) 
				{
					if(arr[i+1]==' ') 
					{
						count--;
					}
				}
			}
		}
		System.out.println(count);
	}
}
	
