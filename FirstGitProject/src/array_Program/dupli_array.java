package array_Program;

import java.util.Scanner;

public class dupli_array {

	public static void main(String[] args) 
	{
		int n,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the element");
		for(int i=0;i<n;i++) 
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Duplicate number is ");
		System.out.println("satya");
		for(int i=0;i<n;i++) 
		{
			for(int j=i+1;j<n;j++) 
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
				
				//break;
			}
			if(count>=1) 
			{
				System.out.println(a[i]);
			}
			count=0;
		}
		

	}

}
