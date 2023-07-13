package String_Program;

import java.util.Scanner;

public class fullstop_count {

	public static void main(String[] args) 
	{
		String str;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		str=sc.nextLine();
		sc.close();
		char[]arr=str.toCharArray();
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]=='.') 
			{
				count++;	
			}
		}
		System.out.println("the fullstop  present is "+count);
	}

}
