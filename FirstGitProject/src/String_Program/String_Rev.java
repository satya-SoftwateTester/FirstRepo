package String_Program;

import java.util.Scanner;

public class String_Rev {

	public static void main(String[] args) {
	String str;
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter a String");
	str=sc.nextLine();
	char []arr=str.toCharArray();

	for(int i=0;i<arr.length/2;i++) 
	{
		char temp=arr[arr.length-1-i];
		arr[arr.length-1-i]=arr[i];
		arr[i]=temp;
	}
	System.out.println("the reverse String is ");
	for(int i=0;i<arr.length;i++) 
	{
		System.out.print(arr[i]);
	}
		// TODO Auto-generated method stub

	}
}

