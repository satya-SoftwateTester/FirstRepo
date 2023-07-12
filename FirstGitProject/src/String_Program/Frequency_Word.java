package String_Program;

import java.util.Scanner;

public class Frequency_Word {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		char[]a=str.toCharArray();
		int count;
		for(int i=0;i<a.length;i++) 
		{
			count=0;
			for(int j=i;j<a.length;j++) 
			{
				if(a[i]==a[j]) 
				{
					count++;
					for(int k=i-1;k>=0;k--) 
					{
						if(a[k]==a[i]) 
						{
							count--;
						}
					}
				}
			}
			if(count>0) 
			{
				System.out.println(a[i]+"-"+count);
			}
			count=0;
		}
	}

}
